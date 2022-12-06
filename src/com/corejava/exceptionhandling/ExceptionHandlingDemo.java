package com.corejava.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int num = 10;
		int d = 0;

		try {
			System.out.println(num / d);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage() + " Index Out Of Bounds");
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage() + " Arithmetic");
		} catch (Exception ex) {
			// ex.printStackTrace();
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Completed");
		}

	}

}
