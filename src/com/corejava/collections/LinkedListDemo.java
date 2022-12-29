package com.corejava.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();

		list.add(4);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(5);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

	}

}
