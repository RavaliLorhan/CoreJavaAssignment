package com.lorhan.examples;

/*
 * 
 * Class : class is a representation (from which objects are created) of how an object should look like.
 * Here Employee is a class and it is representing an actual Employee
 * It has variables and methods
 * 
 */


public class Employee2 {

	//variables 
	private int empId;
	private String empName;
	private String empAdd;
	private String position;
	
	//methods
	protected int getEmpId() {
		return empId;
	}
	protected void setEmpId(int empId) {
		this.empId = empId;
	}
	protected String getEmpName() {
		return empName;
	}
	protected void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	protected void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	protected String getPosition() {
		return position;
	}
	protected void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + ", position=" + position
				+ "]";
	}
	
	
}
