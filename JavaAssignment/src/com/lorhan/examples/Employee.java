package com.lorhan.examples;

/*
 * 
 * Class : class is a representation (from which objects are created) of how an object should look like.
 * Here Employee is a class and it is representing an actual Employee
 * It has variables and methods
 * 
 */


public class Employee {

	//variables 
	private int empId;
	private String empName;
	private String empAdd;
	private String position;
	
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
