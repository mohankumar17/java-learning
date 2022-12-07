package com.corejava.innerclasses;

class OuterClass {
	private int num;

	public OuterClass(int num) {
		this.num = num;
	}

	class InnerClass {
		public void printNum() {
			System.out.println(num);
		}
	}
}

public class MemberInnerClassDemo {

	public static void main(String[] args) {
		OuterClass ocOb = new OuterClass(10);
		OuterClass.InnerClass inOb = ocOb.new InnerClass();
		inOb.printNum();
	}

}
