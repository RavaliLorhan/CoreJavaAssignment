package com.lorhan.examples;

interface Inf1
{
	void show();
}

interface Inf2
{
	void fun();
}
//interface to interface inheritance like class to class inheritance
interface Inf3 extends Inf1,Inf2//Extension is allowed. extension happens on multiple fashion
{
	
}


class One implements Inf3//Inf1,Inf2//(Multiple Inheritance is not allowed through classes but  it is allowed with interfaces)
{

	@Override
	public void show() {
	
		System.out.println("This is show method");
	}

	@Override
	public void fun() {
		
	System.out.println("This is fun method");	
	}
	void hello()
	{
		System.out.println("hello");
	}
	
}



public class InterfaceExample {

	public static void main(String[] args) {
		
		
		Inf3 i3=new One();
		i3.show();
		i3.fun();
		//i3.hello();//err

		One o=(One)i3;//down-casting
		o.hello();
		
	}

}

