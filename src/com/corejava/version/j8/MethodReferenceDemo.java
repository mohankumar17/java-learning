package com.corejava.version.j8;

@FunctionalInterface
interface Calculate {
	public float calc(double a, double b, String op);
}

@FunctionalInterface
interface Message2 {
	public void printMsg(String msg);
}

public class MethodReferenceDemo {

	public MethodReferenceDemo() {
		System.out.println("Constructor Method Reference");
	}

	public MethodReferenceDemo(String msg) {
		System.out.println(msg);
	}

	public float arithmeticOps(double a, double b, String op) {
		if (op.charAt(0) == '+') {
			return (float) (a + b);
		} else if (op.charAt(0) == '-') {
			return (float) (a - b);
		} else if (op.charAt(0) == '*') {
			return (float) (a * b);
		} else {
			return (float) (a / b);
		}

	}

	public static void main(String[] args) {

		/*
		 * Calculate cOb = (double a, double b, String op) -> { if (op.charAt(0)
		 * == '+') { return (float) (a + b); } else if (op.charAt(0) == '-') {
		 * return (float) (a - b); } else if (op.charAt(0) == '*') { return
		 * (float) (a * b); } else { return (float) (a / b); }
		 * 
		 * };
		 */

		// Calculate cOb = MethodReferenceDemo::arithmeticOps; //Static method
		// reference
		Calculate cOb = new MethodReferenceDemo()::arithmeticOps; // Non-Static
																	// method
																	// reference
		Message2 mOb = MethodReferenceDemo::new; // Constructor method reference

		System.out.println(cOb.calc(5.6d, 2.8d, "+"));
		System.out.println(cOb.calc(5.6d, 2.8d, "-"));
		System.out.println(cOb.calc(5.6d, 2.8d, "*"));
		System.out.println(cOb.calc(5.6d, 2.8d, "/"));
		mOb.printMsg("Hello");

	}

}
