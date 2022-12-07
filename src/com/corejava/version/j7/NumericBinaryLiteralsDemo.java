package com.corejava.version.j7;

public class NumericBinaryLiteralsDemo {

	public static void main(String[] args) {

		int num1 = 14_00_000;
		float num2 = 23_12.64_005f;
		// Invalid Literals - _14_000, 14_000_, 23._17, 23_.17

		System.out.println(num1);
		System.out.println(num2);

		byte b1 = 0b1010;
		byte b2 = 0B1100;

		System.out.println(b1);
		System.out.println(b2);

		System.out.println(b1 & b2);
		System.out.println(b1 ^ b2);
		System.out.println(b1 | b2);
	}

}
