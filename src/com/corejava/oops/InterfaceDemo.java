package com.corejava.oops;

interface Laptop {
	public String showBrand(String name);

	public double showPrice(double price);

	default void showSeller(String sellerName) {
		System.out.println(sellerName);
	}
}

class Seller implements Laptop {

	@Override
	public String showBrand(String name) {
		return name.toUpperCase();
	}

	@Override
	public double showPrice(double price) {
		return price - (price * 0.1d);
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Laptop ob = new Seller();
		ob.showSeller("Ski Rocks");
		System.out.println(ob.showBrand("Dell") + " " + ob.showPrice(70000.0d));
	}

}
