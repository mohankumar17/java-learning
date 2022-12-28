package com.corejava.oops;

class ParentB {
	private String msg;

	public ParentB(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void displayMsg() {
		System.out.println("Parent");
	}
}

class ChildB1 extends ParentB {
	private int num;

	public ChildB1(int num, String msg) {
		super(msg);
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	@Override
	public void displayMsg() {
		System.out.println("Child");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		ChildB1 ob = new ChildB1(10, "Parent");
		System.out.println(ob.getMsg() + " " + ob.getNum());
		ob.displayMsg();

		ParentB pOb = new ParentB("Overriding");
		pOb.displayMsg();
	}

}
