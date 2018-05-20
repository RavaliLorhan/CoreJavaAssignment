package com.lorhan.examples;

public class StaticVariableExample {

	public static void main(String[] args) {
	
		for(int i=0;i<5;i++)
		{
			Counter c = new Counter();
		}
		Counter c1 = new Counter();
		c1.setName("IncrementCounter");
		Counter c2 = new Counter();
		c2.setName("DecrementCounter");
		//Accessing static variables of a class does not require instance of the class
		System.out.println("No. of objects created for Counter class is : "+Counter.staticCount);
		
		//Accessing non-static variables of a class requires instance of that class
		System.out.println("Counter names : "+c1.getName()+", "+c2.getName());
		
	}

}

class Counter 
{
	//static variables and methods belongs to the class 
	static int staticCount = 0;
	
	//no-static variables and methods belongs to the object 
	String name;
	Counter()
	{
		staticCount++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}