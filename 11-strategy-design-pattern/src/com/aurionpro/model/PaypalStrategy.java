package com.aurionpro.model;

public class PaypalStrategy implements PaymentStrategy {
	private String emailid;
	private String password;

	public PaypalStrategy(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Paid using Paypal: " + amount);

	}

}
