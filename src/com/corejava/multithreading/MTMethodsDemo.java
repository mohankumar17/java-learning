package com.corejava.multithreading;

class UtilA3 implements Runnable {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("UtilA3");
		}
	}
}

class UtilB3 implements Runnable {
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("UtilB3");
		}
	}
}

public class MTMethodsDemo {

	public static void main(String[] args) {
		UtilA3 ob1 = new UtilA3();
		Thread th1 = new Thread(ob1, "Thread-1");

		UtilB3 ob2 = new UtilB3();
		Thread th2 = new Thread(ob2, "Thread-2");

		System.out.println(th1.getName());
		System.out.println(th2.getName());
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());

		th1.setPriority(4);
		th2.setPriority(9);

		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		th1.start();
		th2.start();

	}

}
