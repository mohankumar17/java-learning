package com.corejava.exceptionhandling;

class AgeException extends Exception {

	public AgeException(String msg) {
		super(msg);
	}
}

public class CustomExceptionDemo {

	public static void validateAge(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException("Not Adult");
		} else {
			System.out.println("Adult");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(14);
		} catch (AgeException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
