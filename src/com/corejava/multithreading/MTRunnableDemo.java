package com.corejava.multithreading;

class UtilA2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("UtilA2");
		}
	}
}

class UtilB2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("UtilB2");
		}
	}
}

public class MTRunnableDemo {

	public static void main(String[] args) {
		UtilA2 ob1 = new UtilA2();
		Thread th1 = new Thread(ob1);
		th1.start();

		UtilB2 ob2 = new UtilB2();
		Thread th2 = new Thread(ob2);
		th2.start();
	}

}
