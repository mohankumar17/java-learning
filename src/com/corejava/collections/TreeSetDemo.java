package com.corejava.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer> hs = new TreeSet<>();

		hs.add(4);
		hs.add(1);
		hs.add(3);
		hs.add(1);
		hs.add(2);
		hs.add(3);

		hs.forEach((each) -> {
			System.out.print(each + " ");
		});
		System.out.println();

		System.out.println(hs.contains(3));
		System.out.println(hs.contains(6));
		System.out.println(hs.remove(3));
		System.out.println(hs);

	}

}
