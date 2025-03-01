package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	Employee emp;
	public void show() {
		System.out.println("In Student >>> show()...");
		emp.show();
	}
}
