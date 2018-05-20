package com.lorhan.examples;

//Refined version of shape to do RTP
abstract class Shape //class which we cannot create objects
{
	abstract void draw();//methods that are declared without implementation are called abstract method 
	
	Shape()//Compiler will create the constructor by default
	//but we cannot write any parameterized constructor for an abstract class because objects of this class cannot be instantiated.
	{
		System.out.println("-------Shape Contructor--------");
	}
	void fun()
	{
		System.out.println("This is for fun");
	}
}

class Circle extends Shape
{
	public void draw()//overriding rule with access modifier
	{
		System.out.println("Drawing a circle");
	}
}
class Rectangle extends Shape
{

	public void draw()
	{
		System.out.println("Drawing a rectangle");
	}
}
class Polygon extends Shape
{
	public void draw()
	{
		System.out.println("Drawing a Polygon");
	}
}





public class AbstractExample {

	public static void main(String[] args) {
	//Run time polymorphism
		
	Shape s;
	
	s=new Circle();
	s.draw();
	
	s=new Rectangle();
	s.draw();
	
	s=new Polygon();
	s.draw();
	
	//having a object of Shape class and having draw definition is of no use
//	s=new Shape(); No cannot instantiate an abstract class
//	s.draw();
	
	

	}

}
