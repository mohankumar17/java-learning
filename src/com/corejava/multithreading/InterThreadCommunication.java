package com.corejava.multithreading;

class CustomerUtil {
	private int amount;

	public CustomerUtil(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	synchronized public void deposit(int i) {
		System.out.println("Depositing amount");
		amount += i;
		System.out.println("Deposited: " + i);
		System.out.println("Balance: " + getAmount());
		notify();
	}

	synchronized public void withdraw(int i) {
		System.out.println("Withdrawing amount");
		if (amount < i) {
			try {
				System.out.println("Low Balance!!! Waiting for deposit");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		amount -= i;
		System.out.println("Withdrawn: " + i);
		System.out.println("Balance: " + getAmount());
	}

}

class UtilA10 implements Runnable {
	CustomerUtil ob;

	public UtilA10(CustomerUtil ob) {
		this.ob = ob;
	}

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ob.deposit(1500);
	}
}

class UtilB10 implements Runnable {
	CustomerUtil ob;

	public UtilB10(CustomerUtil ob) {
		this.ob = ob;
	}

	public void run() {
		ob.withdraw(2000);
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		CustomerUtil ob = new CustomerUtil(1000);

		UtilA10 ob1 = new UtilA10(ob);
		Thread th1 = new Thread(ob1);
		UtilB10 ob2 = new UtilB10(ob);
		Thread th2 = new Thread(ob2);

		th1.start();
		th2.start();
	}

}
