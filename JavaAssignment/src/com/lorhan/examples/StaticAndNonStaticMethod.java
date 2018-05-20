package com.lorhan.examples;

public class StaticAndNonStaticMethod {

	public static void main(String[] args) {
		
		Example e = new Example();
		Example.displayMessage1();
		e.displayMessage2();
	}

}

class Example
{
	static void displayMessage1()
	{
		System.out.println("Accessing static methods of a class does not require instance of the class");
	}
	void displayMessage2()
	{
		System.out.println("Accessing non-static methods of a class requires instance of the class");
	}
}