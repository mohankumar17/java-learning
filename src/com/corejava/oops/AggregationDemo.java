package com.corejava.oops;

class Load {
	private double qty;

	public Load(double qty) {
		this.qty = qty;
	}

	public double getQty() {
		return qty;
	}

}

class VehicleA {
	private String type;

	public VehicleA(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public double getPrice(int qty) {
		double q = 1.0d;
		double price = 0.0d;

		try {
			Load lOb = new Load(qty);
			q = lOb.getQty();
		} catch (Exception e) {
			q = 1.0d;
		}
		if (this.type == "A") {
			price = 5000 * q;
		} else if (this.type == "B") {
			price = 3000 * q;
		} else {
			price = 1000 * q;
		}
		return price;
	}
}

public class AggregationDemo {

	public static void main(String[] args) {
		VehicleA ob = new VehicleA("B");
		System.out.println(ob.getPrice(6));
	}

}
