package com.ibm.bank;

public abstract class Account  implements Bank {
		private int accNo;
		private String holder;
		private double balance;
		
		
	}
	public Account(int accNo, String holder, double balance) {
		this.accNo = accNo;
		this.holder = holder;
		this.balance = balance;
	}

	public void summary() {
		System.out.println("A/C No.: " + accNo);
		System.out.println("A/C Holder Name: " + holder);
		System.out.println("Balance: " + balance);
		
	}
	public void deposit(double amount)
	{
		balance +=amount;
	}
	public void withdraw(double amount) {
		if(amount <= balance)
			balance -=amount;
		else
			System.out.println("Not available balance");
	}
		public static void main(String[] args) {

		}

	}

}
