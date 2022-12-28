package com.corejava.misc;

final class Geocode {
	private double lat = 78.145d;
	private double lng = 109.1343d;

	public String getCords() {
		return lat + " " + lng;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

}

public class FinalKeywordDemo {

	private final double PI = 3.14d;

	public static void main(String[] args) {
		FinalKeywordDemo ob = new FinalKeywordDemo();
		System.out.println(ob.PI);

		Geocode fOb = new Geocode();
		System.out.println(fOb.getCords());
		fOb.setLat(84.235d);
		fOb.setLat(103.643d);
		System.out.println(fOb.getCords());
	}

}
