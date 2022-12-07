package com.corejava.version.j7;

public class MultiCatchDemo {

	public static void main(String[] args) {
		int num = 10;
		int d = 0;

		try {
			System.out.println(num / d);
		} catch (IndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("Completed");
		}

	}

}
