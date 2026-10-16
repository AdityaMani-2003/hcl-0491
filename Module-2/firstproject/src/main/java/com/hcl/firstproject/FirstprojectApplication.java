package com.hcl.firstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp1 = context.getBean(Employee.class);
		Employee emp2 = context.getBean(Employee.class);

		emp1.display();

		System.out.println(emp1 == emp2);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

	}
}
