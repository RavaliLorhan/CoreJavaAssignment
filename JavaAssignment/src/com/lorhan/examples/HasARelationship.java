package com.lorhan.examples;


	//In Has-a relationship, One class has a reference of another class
	class Address 
	{
		private String city;
		private String state;
		private String Country;	
		Address(String city,String state,String Country)
		{
			this.city=city;
			this.state=state;
			this.Country=Country;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		
	}

	class Employee3
	{
		private String name;
		private String emp_id;
		private String Dept;
		
		//Here Employee3 class has-a reference of Address class
		private Address address;
		
		Employee3(String name,String emp_id,String Dept,Address address)
		{
			this.name=name;
			this.emp_id=emp_id;
			this.Dept=Dept;
			this.address=address;
		}
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmp_id() {
			return emp_id;
		}


		public void setEmp_id(String emp_id) {
			this.emp_id = emp_id;
		}


		public String getDept() {
			return Dept;
		}


		public void setDept(String dept) {
			Dept = dept;
		}


		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			this.address = address;
		}


		void displayEmpInfo()
		{
			System.out.println("following is the Employee Information "+"\n name: "+name+"\n emp_id : "+emp_id+"\n Department : "+Dept+"\n Address : "+address.getCity()+" "+address.getState()+" "+address.getCountry());
		}
		
	}


	public class HasARelationship {

		public static void main(String[] args) {
			Address add1=new Address("Hannibal","Missouri","USA");
			Employee3 emp1=new Employee3("Ravali","112345678","Development",add1);
			emp1.displayEmpInfo();
		}

	}


