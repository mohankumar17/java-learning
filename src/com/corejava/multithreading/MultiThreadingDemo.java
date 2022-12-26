package com.corejava.multithreading;

class UtilA extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("UtilA");
		}
	}
}

class UtilB extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("UtilB");
		}
	}
}

public class MultiThreadingDemo {

	public static void main(String[] args) {

		UtilA th1 = new UtilA();
		th1.start();

		UtilB th2 = new UtilB();
		th2.start();

	}

}
