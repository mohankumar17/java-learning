package com.corejava.basics;

import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if (num % 5 == 0 && num % 3 != 0) {
			System.out.println("Divisible by 5 only");
		} else if (num % 3 == 0 && num % 5 != 0) {
			System.out.println("Divisible by 3 only");
		} else if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Divisible by 5 and 3");
		} else {
			System.out.println("Not Divisible by 5 and 3");
		}

	}

}
