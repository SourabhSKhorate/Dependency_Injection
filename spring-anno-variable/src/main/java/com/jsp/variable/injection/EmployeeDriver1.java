package com.jsp.variable.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeDriver1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MyConfig.class);
		Employee employee= (Employee)applicationContext.getBean("employee");//class name with 1st letter small
		
		employee.printDetails();
	}
}
