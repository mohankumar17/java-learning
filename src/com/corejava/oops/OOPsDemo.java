package com.corejava.oops;

class Car {
	private int carID;
	private String companyName;
	private String carColour;

	public static String vehicle = "Car";

	public static void displayMsg() {
		System.out.println("Welcome to " + vehicle + " Showroom");
	}

	public Car() {
	}

	public Car(int carID, String companyName, String carColour) {
		this.carID = carID;
		this.companyName = companyName;
		this.carColour = carColour;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

}

public class OOPsDemo {

	public static void main(String[] args) {

		Car.displayMsg();
		System.out.println(Car.vehicle);

		Car ob1 = new Car(1, "Mercedes", "Black");
		System.out.println(ob1.getCarID() + " " + ob1.getCompanyName() + " " + ob1.getCarColour());

		Car ob2 = new Car();
		ob2.setCarID(2);
		ob2.setCompanyName("Tata");
		ob2.setCarColour("Silver");
		System.out.println(ob2.getCarID() + " " + ob2.getCompanyName() + " " + ob2.getCarColour());

	}

}
