package com.corejava.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		
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
