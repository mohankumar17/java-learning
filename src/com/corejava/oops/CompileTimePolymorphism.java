package com.corejava.oops;

public class CompileTimePolymorphism {

	public void displayMsg() {
		System.out.println("No Args Method");
	}

	public void displayMsg(int num) {
		System.out.println("Int Arg Method");
	}

	public void displayMsg(int num, String msg) {
		System.out.println("Int and String Args Method");
	}

	public void displayMsg(float num) {
		System.out.println("Float Arg Method");
	}

	public static void main(String[] args) {
		CompileTimePolymorphism ob = new CompileTimePolymorphism();
		ob.displayMsg();
		ob.displayMsg(12.4f);
		ob.displayMsg(234);
		ob.displayMsg(13, "Hello");
	}

}
