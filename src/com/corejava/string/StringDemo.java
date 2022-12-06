package com.corejava.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Tour";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.startsWith("co"));
		System.out.println(s1.endsWith("ur"));
		System.out.println(s1.indexOf("u"));

		String s2 = "Tour";
		String s3 = "tour";
		String s4 = "trip";

		System.out.println(s1 == s2);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s4.compareTo(s3));
		System.out.println(s4.toUpperCase());
		System.out.println(s3.concat(s4));

		String s5 = new String("Tour");
		String s6 = new String("Tour");
		String s7 = new String("Trip");
		String s8 = new String("AXE");

		System.out.println(s5 == s6);
		System.out.println(s5 == s7);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		System.out.println(s5.compareTo(s6));
		System.out.println(s8.toLowerCase());

		String[] list = { "ABC", "DEF", "GHI" };
		String jStr = String.join("-", list);
		System.out.println(jStr);
	}

}
