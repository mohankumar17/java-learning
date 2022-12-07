package com.corejava.version.j8;

interface DefaultDemo {
	default void printMsg(String msg) {
		System.out.println(msg);
	}
}

public class DefaultMethodDemo implements DefaultDemo {

	public static void main(String[] args) {
		DefaultMethodDemo ob = new DefaultMethodDemo();
		ob.printMsg("Hello from default method of interface");

	}

}
