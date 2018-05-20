package com.lorhan.typesOfInheritances;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		b.m1();
		System.out.println("Inheritance between class A and class B is single level inheritance");

	}

}
class A
{
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	void m1()
	{
		a=10;
		b=20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

class B extends A
{
	private int c;
	private int d;
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	void m1()
	{
		c=10;
		d=20;
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
}


