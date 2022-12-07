package com.corejava.version.jx;

public class VarArgsDemo {

	public static void printItems(String... items) {
		//for-each loop
		for (String each : items) {
			System.out.println(each);
		}
	}

	public static void main(String[] args) {

		printItems("Coffee", "Tea", "Milk"); //Static Import, So class name not required 

	}

}
