package com.lorhan.examples;
//Wrapper classes are used to wrap primitive data types into objects
public class WrapperClassesExample {


	public static void main(String[] args) {
		
		byte a=50;
		Byte val1=a;//Boxing
		System.out.println("value1 = "+val1);
			
		short b=85;
		Short val2=b;
		System.out.println("Value2 = "+val2);
		
		int c=250;
		Integer val3=c;
		System.out.println("Value3 = "+val3);
		
		long d=89;
		Long val4=d;
		System.out.println("Value4 = "+val4);
		
		float e=8975.5f;
		Float val5=e;
		System.out.println("Value5 = "+val5);
		
		double f=85825.7;
		Double val6=f;
		System.out.println("Value6 = "+val6);
		
		
		//	Unboxing
		byte u=val1;
		short v=val2;
		int w=val3;
		long x=val4;
		float y=val5;
		double z=val6;
		
		System.out.println("Value of u "+u);
		System.out.println("Value of v "+v);
		System.out.println("Value of w "+w);
		System.out.println("Value of x "+x);
		System.out.println("Value of y "+y);
		System.out.println("Value of z "+z);
		
		

	}
}
