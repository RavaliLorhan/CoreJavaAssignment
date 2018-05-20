package com.lorhan.packageExample;

//Packages : group of classes and interfaces.two types - built-in & user-defined
//To use the classes which are in different packages , we should import them

//Built-in packages
import java.util.Date;
import java.util.Scanner;

import com.lorhan.examples.Employee;

public class Demo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Today's date = "+date);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name ");
		String name = scan.nextLine();
		
		Employee empl = new Employee();
		empl.setEmpName(name);
		
		System.out.println("Emp name = "+empl.getEmpName());

	}

}
