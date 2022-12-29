package com.corejava.collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Integer> list = new Vector<>();

		list.add(4);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(5);

		for (int ele : list) {
			System.out.print(ele + " ");
		}
		System.out.println();

	}

}
