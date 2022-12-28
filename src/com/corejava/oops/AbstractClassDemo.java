package com.corejava.oops;

abstract class Factory {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return "SomeCity";
	}

	public abstract String getGoodsType();

}

class FactoryExt extends Factory {

	@Override
	public String getGoodsType() {
		return "Cars";
	}

}

public class AbstractClassDemo {

	public static void main(String[] args) {
		Factory fOb = new FactoryExt();
		fOb.setName("Aki");
		
		System.out.println(fOb.getName() + " " + fOb.getLocation() + " " + fOb.getGoodsType());
	}

}
