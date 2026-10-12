package Assignment1;

import java.util.*;

public class EmpCrud {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // CREATE
        employees.add(new Employee(1, "Aman", 30000));
        employees.add(new Employee(2, "Rahul", 45000));
        employees.add(new Employee(3, "Priya", 25000));
        employees.add(new Employee(4, "Neha", 50000));

        System.out.println("All Employees:");
        System.out.println(employees);

        // READ - Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // UPDATE - Update employee salary
        for (Employee e : employees) {
            if (e.id == 2) {
                e.salary = 60000;
            }
        }

        System.out.println("\nAfter Update:");
        System.out.println(employees);

        // DELETE - Remove employee using Iterator
        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();

            if (e.id == 3) {
                itr.remove();
            }
        }

        System.out.println("\nAfter Delete:");
        System.out.println(employees);

        // ListIterator - Forward Traversal
        System.out.println("\nListIterator Forward:");
        ListIterator<Employee> li = employees.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        // ListIterator - Backward Traversal
        System.out.println("\nListIterator Backward:");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // ASCENDING ORDER - By Salary
        employees.sort(Comparator.comparingDouble(e -> e.salary));

        System.out.println("\nAscending Order (Salary):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // DESCENDING ORDER - By Salary
        employees.sort(
                Comparator.comparingDouble((Employee e) -> e.salary).reversed()
        );

        System.out.println("\nDescending Order (Salary):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}