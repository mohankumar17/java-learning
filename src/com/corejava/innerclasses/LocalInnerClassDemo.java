package com.corejava.innerclasses;

class OuterClass2 {
	private int num;

	public OuterClass2(int num) {
		this.num = num;
	}

	public void innerClass() {
		class InnerClass2 {
			public void printNum() {
				System.out.println(num);
			}
		}
		InnerClass2 inOb = new InnerClass2();
		inOb.printNum();
	}

}

public class LocalInnerClassDemo {

	public static void main(String[] args) {
		OuterClass2 ocOb = new OuterClass2(10);
		ocOb.innerClass();
	}

}
