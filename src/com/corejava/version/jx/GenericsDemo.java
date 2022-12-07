package com.corejava.version.jx;

class GenList<T> {
	T obj;

	public GenList(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		Integer num1 = 10;
		GenList<Integer> intOb = new GenList<>(num1);
		System.out.println(intOb.getObj());

		Float num2 = 13.45f;
		GenList<Float> flOb = new GenList<>(num2);
		System.out.println(flOb.getObj());

		String s1 = "Generics";
		GenList<String> sOb = new GenList<>(s1);
		System.out.println(sOb.getObj());
	}

}
