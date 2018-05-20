package com.lorhan.examples;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer to check if the number is even or odd");
		int i = scan.nextInt();
		
		//Checks the if condition, If its true,it goes inside or else it doesn't
		if (i != 0) {
			if (i % 2 == 0) {
				System.out.println(i + " is an even number");
			} else {
				System.out.println(i + " is an odd number");
			}
		} else {
			System.out.println("0 is neither even nor odd");
		}
	}
}
