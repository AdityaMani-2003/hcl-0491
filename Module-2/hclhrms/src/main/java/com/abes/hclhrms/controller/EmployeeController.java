package com.abes.hclhrms.controller;

import com.abes.hclhrms.entity.Employee;
import com.abes.hclhrms.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImp employeeServiceImp;

    @GetMapping("/")
    public String welcomeMsg(){
        return "Welcome to ABES HRMS";
    }

    @GetMapping("/addemp")
    public String addnewEmployee(){
        return employeeServiceImp.addEmp();
    }

    @GetMapping("/getemp")
    public List<Employee> getEmp(){
        return employeeServiceImp.getEmp();
    }

    @GetMapping("/getemp/{empId}")
    public Employee getEmpById(@PathVariable long empId) {
        return employeeServiceImp.getEmpById(empId);
    }

    @GetMapping("/addemp/bulk")
    public String addEmpBulk() {
        return employeeServiceImp.addEmpBulk();
    }

    @DeleteMapping("/deleteemp/{empId}")
    public String deleteById(@PathVariable long empId) {
        return employeeServiceImp.deleteById(empId);
    }

    @PutMapping("/updateemp/{empId}")
    public String updateById(
            @PathVariable long empId,
            @RequestBody Employee updatedEmp) {
        return employeeServiceImp.updateById(empId, updatedEmp);
    }
}