package com.lorhan.examples;

public class CompileTimePolymorphism {

	public static void main(String[] args) {

		 int num1 = multiplyNum(10, 20);
		 int num2 = multiplyNum(10, 20, 30);
		 double num3 = multiplyNum(25.2, 23.5);
		 
		 System.out.println("Multiplication of given two numbers is "+num1);
		 System.out.println("Multiplication of given three numbers is "+num2);
		 System.out.println("Multiplication of given two float numbers is "+num3);
		 
		
	}

	//Compile time polymorphism : Polymorphism which is resolved at compile time is Compile time polymorphism.
	//Method overloading is an example of Compile time polymorphism.
	//Method overloading allows us to have same method name for different methods which vary in number,sequence or type of arguments.
	static int multiplyNum(int a,int b)
	{
		return a*b;
	}
	
	
	static int multiplyNum(int a,int b,int c)
	{
		return a*b*c;
	}
	
	static double multiplyNum(double a,double b)
	{
		return a*b;
	}
}
