package com.abes.hrms.model;

import com.abes.hrms.repository.EmpRepo;
import com.abes.hrms.repository.EmpRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoEmployee {
    @Autowired
    private EmpRepoImp emprepo;

    public int add(){
        int a =20;
        int b =30;
        return emprepo.add(a,b);
    }
    public double squareRoot(){
        return emprepo.squareroot(2000);
    }
}