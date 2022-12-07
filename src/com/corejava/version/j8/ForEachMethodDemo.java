package com.corejava.version.j8;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //Type-Inferred from left hand side
		list.add(13);
		list.add(25);
		list.add(45);
		list.add(68);
		list.add(34);

		list.forEach((eachItem) -> {
			System.out.print(eachItem + " ");
		});

	}

}
