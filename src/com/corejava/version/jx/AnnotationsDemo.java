package com.corejava.version.jx;

@interface MyAnnotation {
	int value();
}

@FunctionalInterface
interface Calculator {
	public void calc();
}

public class AnnotationsDemo implements Calculator {

	@MyAnnotation(value = 10)
	public void printMsg() {
		System.out.println("Hello Annotations");
	}

	@Override
	public void calc() {
		System.out.print("Calculated");
	}

	public static void main(String[] args) {
		AnnotationsDemo ob = new AnnotationsDemo();
		ob.printMsg();
		ob.calc();
	}

}
