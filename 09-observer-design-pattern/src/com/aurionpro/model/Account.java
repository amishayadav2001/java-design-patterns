package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<INotifier>();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			notifiers.forEach((notifier) -> {
				notifier.notifyUser(this, amount, TransactionType.DEPOSIT);

			});
		}
	}

	// public void Withdraw(double amount) {
	// if (balance - amount > 0) {
	// balance -= amount;
	// notifiers.forEach((notifier) -> {
	// notifier.notifyUser(this, amount, TransactionType.WITHDRAW);
	//
	// });
	//
	// }
	//
	// }

	public void Withdraw(double amount) throws InsufficientBalanceException {
		if (balance - amount > 0) {
			balance = balance - amount;
			for (INotifier x : notifiers) {
				x.notifyUser(this, amount, TransactionType.WITHDRAW);
			}
		} else {

			throw new InsufficientBalanceException("Insufficient Funds");

		}
	}

	public void registerNotifier(INotifier notifier) {
		this.notifiers.add(notifier);

	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}

}
