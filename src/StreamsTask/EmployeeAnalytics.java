package StreamsTask;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class EmployeeAnalytics {

    record Employee(int id, String name, String dept, BigDecimal salary,
                    LocalDate hireDate, Set<String> skills) {}

    static Employee e(int id, String n, String d, int sal, String date, String... skills) {
        return new Employee(id, n, d, BigDecimal.valueOf(sal),
                LocalDate.parse(date), Set.of(skills));
    }

    public static void main(String[] args) {
        List<Employee> emps = List.of(
                e(1, "Asha",   "Engineering",  90000, "2019-03-01", "Java", "SQL"),
                e(2, "Ravi",   "Engineering", 120000, "2016-07-15", "Java", "Spring", "AWS"),
                e(3, "Meera",  "HR",           60000, "2020-01-10", "Recruiting"),
                e(4, "John",   "Sales",        70000, "2018-11-20", "Negotiation", "CRM"),
                e(5, "Priya",  "Engineering", 105000, "2021-05-05", "Java", "React"),
                e(6, "Karan",  "Sales",        65000, "2022-02-14", "CRM"),
                e(7, "Sara",   "HR",           62000, "2017-09-09", "Recruiting", "Payroll"),
                e(8, "Vikram", "Finance",      80000, "2015-04-30", "Excel", "SQL"));

        // Q1: Names of Engineering employees, sorted by salary descending
        List<String> q1 = emps.stream()
                .filter(emp -> emp.dept().equals("Engineering"))
                .sorted((s1, s2) -> s2.salary().compareTo(s1.salary()))
                .map(Employee::name)
                .toList();
        System.out.println("Q1: " + q1);   // [Ravi, Priya, Asha]

        // Q2: Names of the top 3 earners overall
        List<String> q2 = emps.stream()
                .sorted((s1, s2) -> s2.salary().compareTo(s1.salary()))
                .limit(3)
                .map(Employee::name)
                .toList();
        System.out.println("Q2: " + q2);   // [Ravi, Priya, Asha]

        // Q3: Employee names grouped by department
        Map<String, List<String>> q3 = emps.stream()
                .collect(Collectors.groupingBy(Employee::dept, TreeMap::new,
                        Collectors.mapping(Employee::name, Collectors.toList())));
        System.out.println("Q3: " + q3);
        // {Engineering=[Asha, Ravi, Priya], Finance=[Vikram], HR=[Meera, Sara], Sales=[John, Karan]}

        // Q4: Number of employees in each department
        Map<String, Long> q4 = emps.stream()
                .collect(Collectors.groupingBy(Employee::dept, TreeMap::new, Collectors.counting()));
        System.out.println("Q4: " + q4);
        // {Engineering=3, Finance=1, HR=2, Sales=2}

        // Q5: Average salary per department
        Map<String, Double> q5 = emps.stream()
                .collect(Collectors.groupingBy(Employee::dept, TreeMap::new,
                        Collectors.averagingDouble(emp -> emp.salary().doubleValue())));
        System.out.println("Q5: " + q5);
        // {Engineering=105000.0, Finance=80000.0, HR=61000.0, Sales=67500.0}

        // Q6: Highest paid employee in each department
        Comparator<Employee> bySalary = (s1, s2) -> s1.salary().compareTo(s2.salary());
        Map<String, String> q6 = emps.stream()
                .collect(Collectors.groupingBy(Employee::dept, TreeMap::new,
                        Collectors.collectingAndThen(Collectors.maxBy(bySalary),
                                opt -> opt.get().name())));
        System.out.println("Q6: " + q6);
        // {Engineering=Ravi, Finance=Vikram, HR=Sara, Sales=John}

        // Q7: Total salary (payroll) of all employees
        BigDecimal q7 = emps.stream()
                .map(Employee::salary)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Q7: " + q7);   // 652000

        // Q8: All distinct skills, sorted alphabetically
        List<String> q8 = emps.stream()
                .flatMap(emp -> emp.skills().stream())
                .distinct()
                .sorted()
                .toList();
        System.out.println("Q8: " + q8);
        // [AWS, CRM, Excel, Java, Negotiation, Payroll, React, Recruiting, SQL, Spring]

        // Q9: Names of employees who know Java
        List<String> q9 = emps.stream()
                .filter(emp -> emp.skills().contains("Java"))
                .map(Employee::name)
                .toList();
        System.out.println("Q9: " + q9);   // [Asha, Ravi, Priya]

        // Q10: Employees hired before 2019, oldest hire first
        List<String> q10 = emps.stream()
                .filter(emp -> emp.hireDate().isBefore(LocalDate.of(2019, 1, 1)))
                .sorted((s1, s2) -> s1.hireDate().compareTo(s2.hireDate()))
                .map(Employee::name)
                .toList();
        System.out.println("Q10: " + q10); // [Vikram, Ravi, Sara, John]

        // Q11: Partition employees by salary >= 90000
        Map<Boolean, List<String>> q11 = emps.stream()
                .collect(Collectors.partitioningBy(
                        emp -> emp.salary().compareTo(BigDecimal.valueOf(90000)) >= 0,
                        Collectors.mapping(Employee::name, Collectors.toList())));
        System.out.println("Q11: " + q11);
        // {false=[Meera, John, Karan, Sara, Vikram], true=[Asha, Ravi, Priya]}

        // Q12: Name of the second highest paid employee
        String q12 = emps.stream()
                .sorted((s1, s2) -> s2.salary().compareTo(s1.salary()))
                .skip(1)
                .findFirst()
                .map(Employee::name)
                .orElse("N/A");
        System.out.println("Q12: " + q12); // Priya
    }
}