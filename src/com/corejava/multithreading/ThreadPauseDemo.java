package com.corejava.multithreading;

class UtilA4 implements Runnable {
	public void run() {
		try {
			Thread.sleep(2000); // 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("UtilA4");
		}
	}
}

class UtilB4 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("UtilB4");
		}
	}
}

public class ThreadPauseDemo {

	public static void main(String[] args) {
		UtilA4 ob1 = new UtilA4();
		Thread th1 = new Thread(ob1);
		th1.start();

		UtilB4 ob2 = new UtilB4();
		Thread th2 = new Thread(ob2);
		th2.start();

	}

}
