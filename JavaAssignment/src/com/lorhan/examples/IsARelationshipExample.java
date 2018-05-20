package com.lorhan.examples;

//is-a relationship is described as a parent-child relationship(inheritance)
public class IsARelationshipExample {

	public static void main(String[] args) {
		Child ch1 = new Child();
		ch1.setNameofparent("Renuka");
		ch1.setAge((byte) 22);
		ch1.displayname();
		ch1.displayage();

	}

}

class Parent {
	private String nameofparent;

	void displayname() {
		System.out.println("parent name is " + nameofparent);
	}

	public void setNameofparent(String name) {
		nameofparent = name;
	}

	public String getNameofparent() {
		return nameofparent;
	}
	
}

class Child extends Parent {
	private int age;

	public void setAge(int myage) {
		age = myage;
	}
	

	public int getAge() {
		return age;
	}


	void displayage() {
		System.out.println("Child age is " + age);
	}
}