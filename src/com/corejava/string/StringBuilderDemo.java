package com.corejava.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Tour");
		// default capacity - 16, so newCapacity - 16 + 4(Tour) = 20
		System.out.println(sb.capacity());
		sb.append("T");
		sb.append("rip");
		System.out.println(sb);
		System.out.println(sb.length());

		// capacity = 20
		sb.append("WelcomeToAustralia");
		// capacity = (oldCapacity*2)+2 = (20*2)+2 = 42
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		System.out.println(sb);
		sb.insert(15, "All");
		System.out.println(sb);

		sb.replace(4, 8, "-");
		System.out.println(sb);

		sb.delete(12, 15);
		System.out.println(sb);

	}

}
