package com.lorhan.typesOfInheritances;

public class MultipleInheritance {

	public static void main(String[] args) {
		
		I3 i3 = new I3();
		i3.m1();
		i3.m2();
		System.out.println("class I3 is implementing both the interfaces I1 and I2.Hence showing multiple inheritance");

		
	}

}

interface I1
{
	void m1();
}
interface I2
{
	void m2();
}
class I3 implements I1 ,I2
{

	@Override
	public void m2() {
		System.out.println("Inside m2 method");
	}

	@Override
	public void m1() {
		System.out.println("Inside m1 method");
	}
	
}