package com.corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<>();

		mp.put("A", 14);
		mp.put("C", 14);
		mp.put("D", 17);
		mp.put("B", 12);
		mp.put("A", 16);
		mp.put("E", 18);

		for (String key : mp.keySet()) {
			System.out.print(key + ": " + mp.get(key) + ", ");
		}
		System.out.println();
		System.out.println(mp.containsKey("B"));
		System.out.println(mp.remove("E"));
		System.out.println(mp);
	}

}
