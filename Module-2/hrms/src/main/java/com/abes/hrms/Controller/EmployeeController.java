package com.abes.hrms.Controller;

import com.abes.hrms.model.DemoEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private DemoEmployee demoemployee ;


    @GetMapping("/")
    public String Welcome(){
        return "Welcome to HRMS app";

    }
    @GetMapping("/add")
    public int sum(){
        System.out.println("inside /add controller point");
        int result = demoemployee.add();
        System.out.println("result from model="+result);
        return result;
    }
    @GetMapping("/sqrt")
    public double getSquareRoot(){
        return demoemployee.squareRoot();
    }
}