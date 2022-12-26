package com.corejava.multithreading;

class UtilA5 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				try {
					Thread.currentThread().wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("UtilA5");
		}
	}
}

class UtilB5 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("UtilB5");
		}
		try {
			Thread.currentThread().notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadWaitDemo {

	public static void main(String[] args) {
		UtilA5 ob1 = new UtilA5();
		Thread th1 = new Thread(ob1, "Thread-1");
		th1.start();

		UtilB5 ob2 = new UtilB5();
		Thread th2 = new Thread(ob2, "Thread-2");
		th2.start();

	}

}
