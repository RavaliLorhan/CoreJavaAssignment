package com.lorhan.examples;

import java.util.Arrays;

public class RuntimePolymorphism {

	public static void main(String[] args) {

		//Runtime Polymorphism : A process in which call to an overridden method is resolved at runtime
		//Method overriding : Declaring the same method in sub class which is already declared in super class is called as method overriding 
 
		Person person1 = new Person("Ravali","Springfield");
		System.out.println(person1);
		
		String[] arr = new String[3];
		arr[0] = "Computer Network Principles";
		arr[1] = "GRS";
		arr[2] = "Computer Organization";
		
		Person person2 = new Teacher(3,arr);
		person2.setName("Renuka");
		person2.setAddress("India");
		//Here toString method of Teacher class is being called and overrides the parent class method at runtime.Hence Runtime Polymorphism
		System.out.println(person2);
		
		
		
		
	}

}

class Person {
	private String name;
	private String address;

	public Person() {
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}

class Teacher extends Person {
	private int numOfCourses;
	private String[] courses;


	public Teacher(int numOfCourses, String[] courses) {
		super();
		this.numOfCourses = numOfCourses;
		this.courses = courses;
	}

	public int getNumOfCourses() {
		return numOfCourses;
	}

	public void setNumOfCourses(int numOfCourses) {
		this.numOfCourses = numOfCourses;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + getName() + ", address=" + getAddress() + " , numOfCourses=" + numOfCourses
				+ ", courses=" + Arrays.toString(courses) + "]";
	}

}