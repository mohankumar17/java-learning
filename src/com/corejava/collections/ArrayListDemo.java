package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(4);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(5);

		// System.out.println(list);
		list.forEach((each) -> {
			System.out.print(each + " ");
		});
		System.out.println();
		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		Collections.sort(list);

		for (int ele : list) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		Collections.reverse(list);
		System.out.println(list);

	}

}
