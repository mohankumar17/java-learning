package com.corejava.version.jx;

public class AssertionsDemo {

	public static void main(String[] args) {

		int age = 13;

		assert age >= 18 : "Not Adult";  //enableAssertions using -ea flag to run
		System.out.println("Adult");

	}

}
