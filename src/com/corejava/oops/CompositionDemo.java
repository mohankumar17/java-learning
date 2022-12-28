package com.corejava.oops;

class Engine {
	private int hp;

	public Engine(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}
}

class VehicleB {
	private String type;

	private Engine ob;

	public VehicleB(String type, Engine ob) {
		this.type = type;
		this.ob = ob;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		if (this.ob.getHp() < 1000) {
			return 5_00_000;
		} else {
			return 10_00_000;
		}
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		VehicleB ob = new VehicleB("A", new Engine(1200));
		System.out.println(ob.getPrice());
	}

}
