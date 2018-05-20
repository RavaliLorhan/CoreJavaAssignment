package com.lorhan.examples;

public class TypesOfOverloading {

	public static void main(String[] args) {

		Student1 stu1 = new Student1();
		stu1.setStuId(100);
		stu1.setStuName("Ravali");
		stu1.setNumOfCourses(3);
		stu1.setGrade("A+");
		System.out.println(stu1);

		Student1 stu2 = new Student1(101, "Renuka", 4, "A+");
		System.out.println(stu2);

		String string = stu1.toString(50);
		System.out.println("Number converted to String is "+string);
	}

}

class Student1 {
	private int stuId;
	private String stuName;
	private int numOfCourses;
	private String grade;

	// Constructor overloading : if a class has more than one constructor which
	// differ in types, sequence or number of parameters,then it is Constructor
	// overloading
	public Student1() {
	}

	public Student1(int stuId, String stuName, int numOfCourses, String grade) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.numOfCourses = numOfCourses;
		this.grade = grade;
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

	public int getNumOfCourses() {
		return numOfCourses;
	}

	public void setNumOfCourses(int numOfCourses) {
		this.numOfCourses = numOfCourses;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	//Method overloading: It allows us to have same method name for different methods which vary in number,sequence or type of arguments.
	@Override
	public String toString() {
		return "Student1 [stuId=" + stuId + ", stuName=" + stuName + ", numOfCourses=" + numOfCourses + ", grade="
				+ grade + "]";
	}
	
	public String toString(int num)
	{
		return Integer.toString(num);
		
	}

}