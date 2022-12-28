package com.corejava.basics;

public class IterativeDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				continue;
			}
			if (i == 8) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();

		int j = 1;
		while (j <= 5) {
			System.out.print(j * 5 + " ");
			j++;
		}
		System.out.println();

		int k = 0;
		do {
			k = k + 2;
			System.out.print(k + " ");

		} while (k < 10);
		System.out.println();

	}

}
