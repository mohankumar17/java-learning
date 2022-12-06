package com.corejava.exceptionhandling;

public class ThrowThrowsDemo {

	public static void validateAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Not Adult");
		} else {
			System.out.println("Adult");
		}
	}

	public static void main(String[] args) {

		try {
			validateAge(14);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
