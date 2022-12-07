package com.corejava.innerclasses;

class OuterClass3 {
	private static int num = 10;

	static class InnerClass3 {
		public void printNum() {
			System.out.println(num);
		}
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {
		OuterClass3.InnerClass3 inOb = new OuterClass3.InnerClass3();
		inOb.printNum();
	}

}
