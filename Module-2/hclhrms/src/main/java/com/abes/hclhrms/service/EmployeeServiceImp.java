package com.abes.hclhrms.service;
import com.abes.hclhrms.entity.Employee;
import com.abes.hclhrms.repository.EmpRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImp {
    @Autowired
    private EmpRepoImp emprepo;
    public String addEmp(){
        Employee emp1 = new Employee(200,"Rahul","FSD","JAVA","abc@gmail.com");
        return emprepo.addemp(emp1);
    }
    public String addEmpBulk() {
        List<Employee> bulkEmp = Arrays.asList(
                new Employee(201, "Rahul", "Tester",
                        "Java", "rahul@gmail.com"),
                new Employee(202, "Priya", "Developer",
                        "Spring Boot", "priya@gmail.com"),
                new Employee(203, "Aman", "Backend Developer",
                        "Java", "aman@gmail.com"),
                new Employee(204, "Neha", "Frontend Developer",
                        "React", "neha@gmail.com")
        );
        return emprepo.addEmpBulk(bulkEmp);
    }
    public List<Employee> getEmp(){
        return emprepo.getEmp();
    }
    public Employee getEmpById(long empid) {
        return emprepo.getEmpById(empid);
    }
    public String deleteById(long empid) {
        return emprepo.deleteById(empid);
    }
    public String updateById(long empid, Employee updatedEmp) {
        return emprepo.updateById(empid, updatedEmp);
    }
}