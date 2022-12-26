package com.corejava.multithreading;

class UtilA9 implements Runnable {
	public void run() {
		StaticSynchronizationDemo.printTable(5);
	}
}

class UtilB9 implements Runnable {
	public void run() {
		StaticSynchronizationDemo.printTable(8);
	}
}

public class StaticSynchronizationDemo {

	/*
	 * synchronized public static void printTable(int n) { for (int i = 1; i <=
	 * 5; i++) { System.out.println(n + " X " + i + " = " + (n * i)); try {
	 * Thread.sleep(1000); } catch (InterruptedException e) {
	 * e.printStackTrace(); } } }
	 */

	public static void printTable(int n) {
		synchronized (StaticSynchronizationDemo.class) {

			for (int i = 1; i <= 5; i++) {
				System.out.println(n + " X " + i + " = " + (n * i));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		StaticSynchronizationDemo obA = new StaticSynchronizationDemo();
		StaticSynchronizationDemo obB = new StaticSynchronizationDemo();
		UtilA9 ob1 = new UtilA9();
		Thread th1 = new Thread(ob1);
		UtilB9 ob2 = new UtilB9();
		Thread th2 = new Thread(ob2);

		th1.start();
		th2.start();
	}

}
