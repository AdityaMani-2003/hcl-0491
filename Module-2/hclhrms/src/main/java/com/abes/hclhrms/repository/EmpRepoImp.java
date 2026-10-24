package com.abes.hclhrms.repository;

import com.abes.hclhrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpRepoImp implements EmployeeRepo {
    List<Employee> emplist = new ArrayList<>();

    @Override
    public String addemp(Employee emp) {
        emplist.add(emp);
        return "Employee Addedd Successfully";
    }

    @Override
    public String addEmpBulk(List<Employee> bulkEmp) {
        emplist.addAll(bulkEmp);
        return "Employee added successfully";
    }

    @Override
    public List<Employee> getEmp() {
        return emplist;
    }

    @Override
    public Employee getEmpById(long empid) {
        return emplist.stream().filter(e -> e.getEmp_id() == empid).findFirst().orElse(null);
    }

    @Override
    public String deleteById(long empid) {
        boolean status = false;
        if (getEmpById(empid) != null) {
            status = emplist.removeIf(e -> e.getEmp_id() == empid);
        }
        if (status) {
            return "Employee deleted successfully";
        }

        return "Employee id is not registered with id " + empid;
    }

    @Override
    public String updateById(long empid, Employee updatedEmp) {
        Employee emp = getEmpById(empid);

        if (emp != null) {
            emp.setEmail(updatedEmp.getEmail());
            return "Employee updated successfully";
        }

        return "Employee ID is not registered: " + empid;
    }
}