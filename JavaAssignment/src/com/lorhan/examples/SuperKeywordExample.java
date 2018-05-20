package com.lorhan.examples;

//super keyword always refers to parent class object.It is used to access variables and methods of the parent class object
public class SuperKeywordExample {

	public static void main(String[] args) {
		
		Nissan car1 = new Nissan(4,5,"2.0 lit engine","Sedan","Sentra",2010);
		System.out.println(car1);

	}

}

class Car {
	private int doors;
	private int gears;
	private String engine;
	private String type;

	public Car(int doors, int gears, String engine, String type) {
		this.doors = doors;
		this.gears = gears;
		this.engine = engine;
		this.type = type;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", gears=" + gears + ", engine=" + engine + ", type=" + type + "]";
	}
	
	

}

class Nissan extends Car {

	private String model;
	private int year;

	public Nissan(int doors, int gears, String engine, String type, String model, int year) {
		super(doors, gears, engine, type);//Here super refers to Car class constructor
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Nissan [doors=" + getDoors() + ", gears=" + getGears() + ", engine=" + getEngine() + ", type=" + getType() +", model=" + model + ", year=" + year + "]";
	}

}