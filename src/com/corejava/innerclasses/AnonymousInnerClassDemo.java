package com.corejava.innerclasses;

interface Messenger {
	public void printMsg(String msg);
}

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {

		Messenger intRef = new Messenger() {
			public void printMsg(String msg) {
				System.out.println(msg);
			}
		};
		
		intRef.printMsg("Anonymous Inner Class");
	}

}
