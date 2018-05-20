package com.lorhan.examples;

public class TryCatchExample {

	public static void main(String[] args) {
		int[] arr= {25,56,58,52};
		try {
		System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Program completed");
	}

}
