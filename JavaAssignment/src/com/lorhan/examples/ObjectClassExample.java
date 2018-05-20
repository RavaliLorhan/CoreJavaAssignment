package com.lorhan.examples;

//Object class is a super class of every class in Java.
//All the methods that are in object class i.e.,toString,hashCode,equals..etc can be overridden in any class 
public class ObjectClassExample {

	public static void main(String[] args) {

		Student2 s1 = new Student2();
		Student2 s2 = new Student2();

		System.out.println(s1.hashCode());
		System.out.println(s1.equals(s2));
		// Below two statements are equivalent
		System.out.println(s1);
		System.out.println(s1.toString());
		
		
	}

}

class Student2 {
	static int last_roll = 100;
	int roll_no;

	Student2() {
		roll_no = last_roll;
		last_roll++;
	}

	// Overriding hashCode method(method from object class)
	@Override
	public int hashCode() {
		return roll_no;
	}

	// Overriding equals method(method from object class)
	@Override
	public boolean equals(Object obj) {
		Student2 s = (Student2) obj;
		if (this.roll_no == s.roll_no) {
			return true;
		}
		return false;

	}

	// Overriding toString method(method from object class)
	@Override
	public String toString() {
		return "Student2 [roll_no=" + roll_no + "]";
	}

}