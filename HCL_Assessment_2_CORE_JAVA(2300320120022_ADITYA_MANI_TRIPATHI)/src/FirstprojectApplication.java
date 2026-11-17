package com.hcl.firstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employer emp1 = context.getBean(Employer.class);
		Employer emp2 = context.getBean(Employer.class);

		emp1.display();

		System.out.println(emp1 == emp2);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

	}
}
