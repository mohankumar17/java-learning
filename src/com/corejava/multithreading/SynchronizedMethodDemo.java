package com.corejava.multithreading;

class UtilA7 implements Runnable {

	SynchronizedMethodDemo ob;

	public UtilA7(SynchronizedMethodDemo ob) {
		this.ob = ob;
	}

	public void run() {
		ob.printTable(5);
	}
}

class UtilB7 implements Runnable {

	SynchronizedMethodDemo ob;

	public UtilB7(SynchronizedMethodDemo ob) {
		this.ob = ob;
	}

	public void run() {
		ob.printTable(8);
	}
}

public class SynchronizedMethodDemo {

	synchronized public void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SynchronizedMethodDemo ob = new SynchronizedMethodDemo();
		UtilA7 ob1 = new UtilA7(ob);
		Thread th1 = new Thread(ob1);
		UtilB7 ob2 = new UtilB7(ob);
		Thread th2 = new Thread(ob2);

		th1.start();
		th2.start();
	}

}
