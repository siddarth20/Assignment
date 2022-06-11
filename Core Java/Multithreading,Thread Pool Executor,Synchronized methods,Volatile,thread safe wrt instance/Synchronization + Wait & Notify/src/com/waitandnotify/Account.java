package com.waitandnotify;

public class Account {
	private int amount = 10000;
	synchronized void withdraw(int amount) {
		System.out.println("Withdrawing amount "+amount);
		if(this.amount<amount) {
			System.out.println("Account balance is less waiting for a deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdrawing amount deposit received");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Net balance of account is "+this.amount);
	}
	
	synchronized void deposit(int amount) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Depositing amount "+amount);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.amount+=amount;
		System.out.println("Deposited the amount in account "+amount);
		System.out.println("Current balance is "+this.amount);
		notify();
	}
	
	public static void main(String[] args) {
		Account a1 = new Account();
		new Thread(new Runnable() {
			public void run() {
				a1.withdraw(15000);
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				a1.deposit(10000);
			}
		}).start();
	}

}
