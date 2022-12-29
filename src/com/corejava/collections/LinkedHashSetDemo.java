package com.corejava.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> hs = new LinkedHashSet<>();

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
