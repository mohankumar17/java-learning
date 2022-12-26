package com.corejava.multithreading;

class UtilA6 implements Runnable {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + (i * 2));
		}
	}
}

class UtilB6 implements Runnable {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + (i * 3));
		}
	}
}

public class JoinMethodDemo {

	public static void main(String[] args) {
		UtilA6 ob1 = new UtilA6();
		Thread th1 = new Thread(ob1, "Thread-1");
		UtilB6 ob2 = new UtilB6();
		Thread th2 = new Thread(ob2, "Thread-2");

		th1.start();

		try {
			if (th1.isAlive()) {
				th1.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th2.start();

	}

}
