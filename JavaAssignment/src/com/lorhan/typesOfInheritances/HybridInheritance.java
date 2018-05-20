package com.lorhan.typesOfInheritances;

public class HybridInheritance {

	public static void main(String[] args) {

		I i = new I();
		i.m1();
		i.m2();
		i.m3();
		System.out.println("Interface X1 will be acting as the Parent for interfaces X2 & X3 and interfaces X2 & X3 will be acting as Parent for Class I.This is called Hybrid Inheritance(combining Multiple and hierarchial Inheritance)");
	}

}
interface X1
{
	void m1();
}

interface X2 extends X1
{
	void m2();
}
interface X3 extends X1
{
	void m3();
}
class I implements X3 ,X2
{

	
	@Override
	public void m1() {
		System.out.println("Inside m1 method");
	}
	
	

	@Override
	public void m3() {
		System.out.println("Inside m3 method");
		
	}

	@Override
	public void m2() {
		System.out.println("Inside m2 method");
		
	}

	
	
}