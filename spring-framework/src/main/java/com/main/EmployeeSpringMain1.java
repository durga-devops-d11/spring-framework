package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.Employee;

public class EmployeeSpringMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// creating beans by spring container
		ApplicationContext ac=new ClassPathXmlApplicationContext("employee-service.xml");
		
		//saying container to get bean.
		Employee employee= (Employee) ac.getBean("emp1");
		System.out.println(employee);
		
	}

}
