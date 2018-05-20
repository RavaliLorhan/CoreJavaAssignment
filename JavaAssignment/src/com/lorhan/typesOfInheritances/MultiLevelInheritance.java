package com.lorhan.typesOfInheritances;



public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		C c = new C();
		D d = new D();
		E e = new E();
		e.m1();
		System.out.println("Inheritance between class E and class C is multi level inheritance");

	}

}
class C
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

class D extends C
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


class E extends D
{
	private int e;
	private int f;
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	void m1()
	{
		e = 0;
		f = 8;
		System.out.println("e = "+e);
		System.out.println("f = "+f);
	}
}

