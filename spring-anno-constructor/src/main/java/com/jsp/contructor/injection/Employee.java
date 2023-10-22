package com.jsp.contructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	String name;
	String email;
	
	public Employee(@Value(value = "100") int id,@Value(value = "MK") String name,@Value(value = "mk@mail.com") String email){
		this.id=id;
		this.name= name;
		this.email= email;
	}
	
	public void printDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}
	

}
