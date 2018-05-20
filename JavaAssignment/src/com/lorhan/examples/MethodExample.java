package com.lorhan.examples;

public class MethodExample {

	//Method is a piece of code which can called by method's name 	
	void calFactorial(int num)
	{
		int fact = 1;
		for(int i=num; i>=1; i--)
		{
			fact = fact *i;
		}
		System.out.println("Factorial of "+num+" : "+fact);
	}
	
	
	public static void main(String[] args) {
		//Create an object
		MethodExample obj = new MethodExample();
		
		//call the method using the object
		obj.calFactorial(5);
		
	}
}
