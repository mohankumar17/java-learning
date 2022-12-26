package com.corejava.multithreading;

class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

public class GarbageCollectionDemo {

	public static void createObj(String name) {
		Student sOb = new Student(name); // object create inside method
	}

	public static void main(String[] args) {

		Student sOb1 = new Student("Paul");
		Student sOb2 = new Student("Tina");
		Student sOb3 = new Student("John");

		Student sOb4 = sOb1; // de-referencing the object
		// (object with name field Paul will be garbage collected)
		sOb2 = null; // nullifying the reference
		// (object with name field Tina will be garbage collected)

		createObj("Ketan");
		// If method return object, then it wont be available for garbage
		// collection

		System.out.println(Runtime.getRuntime().totalMemory() / 10000);

		System.out.println(Runtime.getRuntime().freeMemory() / 10000);

		System.gc(); // Explicit call to JVM for garbage collection

		System.out.println(Runtime.getRuntime().freeMemory() / 10000);

	}

}
