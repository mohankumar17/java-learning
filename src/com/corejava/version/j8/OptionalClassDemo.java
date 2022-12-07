package com.corejava.version.j8;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {

		String[] str = new String[10];
		//str[5] = "Hand";
		Optional<String> res = Optional.ofNullable(str[5]);
		if (res.isPresent()) {
			System.out.println(str[5].length());
			System.out.println(res.get());
		} else {
			System.out.print("No string exists");
		}

	}

}
