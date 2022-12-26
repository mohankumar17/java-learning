package com.corejava.multithreading;

public class MTAnonymousDemo {

	public static void main(String[] args) {
		Thread th1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread-1");
				}
			}
		};
		th1.start();
		
		Thread th2 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread-2");
				}
			}
		};
		th2.start();

	}

}
