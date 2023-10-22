package com.jsp.variable.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value = "1")
	int id;
	@Value(value = "SK")
	String name;
	@Value(value = "sk@mail.com")
	String email;
	
	Employee(){
		System.out.println("Obeject created by spring");
	}
	
	public void printDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}
}
