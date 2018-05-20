package com.lorhan.examples;

public class LocalVariableExample {

	//Local variable: if a variable's scope is confined to a method then it is a local variable
	private static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		//System.out.println(a); if we try to access variable 'a' , it gives a compilation error
		int c =	add(10,10);
		System.out.println("addition of two numbers = "+c);
		
		
		

	}
}
