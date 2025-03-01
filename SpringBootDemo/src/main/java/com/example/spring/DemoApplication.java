package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Student s=context.getBean(Student.class);
		System.out.println("Hi");
		s.show();
		
//		Employee e=context.getBean(Employee.class);
//		e.show();
	}

}
