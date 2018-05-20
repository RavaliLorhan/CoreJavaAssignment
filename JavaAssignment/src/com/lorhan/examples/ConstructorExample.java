package com.lorhan.examples;

public class ConstructorExample {

	public static void main(String[] args) {
	
		//calling a default constructor at the time of object creation
		Student stu1= new Student();
		
		
		//calling a parameterized constructor at the time of object creation
		Student stu2 = new Student(100,"Ravali","Springfield");
		
		System.out.println("Student [stuId=" + stu2.getStuId() + ", stuName=" + stu2.getStuName()+ ", stuAdd=" + stu2.getStuAdd() + "]");

	}

}

class Student {
	private int stuId;
	private String stuName;
	private String stuAdd;

	// Constructor : It is a block of code that is called at the time of object creation

	// Default constructor
	Student() {
	}

	// Parameterized constructor
	public Student(int stuId, String stuName, String stuAdd) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAdd = stuAdd;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAdd() {
		return stuAdd;
	}

	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAdd=" + stuAdd + "]";
	}

	
}