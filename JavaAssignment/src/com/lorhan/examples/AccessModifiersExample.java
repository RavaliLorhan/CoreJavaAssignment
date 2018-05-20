package com.lorhan.examples;

//Public-Accessible even across the packages(when packages are imported)
public class AccessModifiersExample {

	public static void main(String[] args) {
		
		Developer d = new Developer();
//		Protected- Accessible only by the instance of a subclass
		d.setEmpId(200);
		d.setEmpName("Ravali");
		d.setSalary(8000);
		System.out.println("Employee Name : "+d.getEmpName());

		
	}

}

class Developer extends Employee
{
//	Private members-Accessible within the same class	
	private double salary;

	
	public Developer() {
			salary = 5000;
	}

	double getSalary() {
		return salary;
	}
//	Default members-Accessible within the same package
	void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	
	
	
}
