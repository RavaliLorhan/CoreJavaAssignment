package com.lorhan.examples;

public class ObjectExample {

	public static void main(String[] args) {

		// Object: It is an instance of a class.It has state and behavior

		
		// Here we will create an object for Employee class using 'new' keyword
		// and refer by a reference variable
		Employee emp = new Employee();
		
		// setting values into the variables
		emp.setEmpId(100);
		emp.setEmpName("Ravali");
		emp.setEmpAdd("Piscataway");
		emp.setPosition("Software Trainee");

		//Printing the values in the object
		System.out.println("Employee [ Id: " + emp.getEmpId() + " ,Name : " + emp.getEmpName() + " ,Address : "
				+ emp.getEmpAdd() + " ,Position : " + emp.getPosition() + " ]");
	}

}
