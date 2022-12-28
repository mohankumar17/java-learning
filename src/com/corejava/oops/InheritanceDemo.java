package com.corejava.oops;

class ParentA {
	private String msg;

	public ParentA(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}

class ChildA1 extends ParentA {
	private int num;

	public ChildA1(int num, String msg) {
		super(msg);
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		ChildA1 ob = new ChildA1(10, "Parent");
		System.out.println(ob.getMsg() + " " + ob.getNum());
	}

}
