package com.lorhan.examples;

public class ConcreteMethodExample {

	public static void main(String[] args) {
	
		ConcreteMethodExample obj = new ConcreteMethodExample();
		obj.display();
	
	}
//Concrete method
	void display()
	{
		System.out.println("Methods that are declared with implementation are called concrete methods");
	}
}
