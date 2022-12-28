package com.corejava.misc;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] ar = { 3, 6, 2, 8, 5, 7, 6, 1, 9, 3 };
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		for (int ele : ar) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
	}

}
