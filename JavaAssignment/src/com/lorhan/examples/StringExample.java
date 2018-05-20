package com.lorhan.examples;

public class StringExample {

	public static void main(String[] args) {
		
		//String literal
		String s1 = "Java Programming Language";
		String s2 = "Java Programming Language";
		
		//String object
		String s3 = new String("Spring framework");
		String s4 = new String("Spring framework");
		
		//Comparing two string literals
		System.out.println(s1==s2);
		
		//Comparing two string objects
		System.out.println(s3==s4);
	}

}
