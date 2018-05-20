package com.lorhan.examples;

public class InheritanceExample {

	public static void main(String[] args) {
		
		HourlyEmployee he=new HourlyEmployee();
		he.setEmpId(101);
		he.setEmpName("Ravali");
		he.setEmpAdd("Dallas");
		he.setSalary(250000);
		
		System.out.println("HourlyEmployee [ id= "+he.getEmpId()+", name="+he.getEmpName()+", Address="+he.getEmpAdd()+", salary=" + he.getSalary() + "]");
		}

}

class Employee1
{
	//variables 
		private int empId;
		private String empName;
		private String empAdd;
		
		//methods
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpAdd() {
			return empAdd;
		}
		public void setEmpAdd(String empAdd) {
			this.empAdd = empAdd;
		}
		
}


/*Inheritance  : It is one of the OOPs concept which allows a class to inherit properties 
from another class by using extends keyword
Here HourlyEmployee is extending Employee1 class and getting all the properties from Employee class
*/
class HourlyEmployee extends Employee1
{
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

class SalariedEmployee extends Employee1
{
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}