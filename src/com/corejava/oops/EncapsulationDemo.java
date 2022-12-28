package com.corejava.oops;

class Phone {
	private String name;
	protected int battery;
	public float price;

	public Phone() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

}

class Watch extends Phone {
	private int sensors;

	public Watch() {

	}

	public int getSensors() {
		return sensors;
	}

	public void setSensors(int sensors) {
		this.sensors = sensors;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Phone ob = new Phone();
		ob.setBattery(4500);
		ob.setName("Samsung_Galaxy_S22");
		ob.price = 74999.0f;

		System.out.println(ob.getName() + " " + ob.getBattery() + " " + ob.price);

		Watch wOb = new Watch();
		wOb.setSensors(4);
		wOb.setBattery(2300);

		System.out.println(wOb.getSensors() + " " + wOb.getBattery());

	}

}
