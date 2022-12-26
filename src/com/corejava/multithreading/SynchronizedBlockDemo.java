package com.corejava.multithreading;

class UtilA8 implements Runnable {

	SynchronizedBlockDemo ob;

	public UtilA8(SynchronizedBlockDemo ob) {
		this.ob = ob;
	}

	public void run() {
		ob.printTable(5);
	}
}

class UtilB8 implements Runnable {

	SynchronizedBlockDemo ob;

	public UtilB8(SynchronizedBlockDemo ob) {
		this.ob = ob;
	}

	public void run() {
		ob.printTable(8);
	}
}

public class SynchronizedBlockDemo {

	public void printTable(int n) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n + " X " + i + " = " + (n * i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		SynchronizedBlockDemo ob = new SynchronizedBlockDemo();
		UtilA8 ob1 = new UtilA8(ob);
		Thread th1 = new Thread(ob1);
		UtilB8 ob2 = new UtilB8(ob);
		Thread th2 = new Thread(ob2);

		th1.start();
		th2.start();

	}

}
