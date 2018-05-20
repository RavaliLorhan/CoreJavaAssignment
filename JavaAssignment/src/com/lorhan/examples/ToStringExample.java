package com.lorhan.examples;

public class ToStringExample {

	public static void main(String[] args) {
  
		Person1 p = new Person1("Ramya", 183, 54);
		System.out.println(p);
		
	}

}
class Person1
{
	private String name;
	private int heightInCm;
	private int weightInKgs;
	
	
	public Person1(String name, int heightInCm, int weightInKgs) {
		this.name = name;
		this.heightInCm = heightInCm;
		this.weightInKgs = weightInKgs;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeightInCm() {
		return heightInCm;
	}
	public void setHeightInCm(int heightInCm) {
		this.heightInCm = heightInCm;
	}
	public int getWeightInKgs() {
		return weightInKgs;
	}
	public void setWeightInKgs(int weightInKgs) {
		this.weightInKgs = weightInKgs;
	}

	//toString method gives String representation of an object
	@Override
	public String toString() {
		return "Person [name=" + name + ", heightInCm=" + heightInCm + ", weightInKgs=" + weightInKgs + "]";
	}
	
	
	
}