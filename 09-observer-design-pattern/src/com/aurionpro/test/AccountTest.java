package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.InsufficientBalanceException;
import com.aurionpro.model.SmsNotifier;
import com.aurionpro.model.WhatsappNotifier;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(111, "Amisha", 11000);
		account.registerNotifier(new SmsNotifier());
		account.registerNotifier(new EmailNotifier());
		account.registerNotifier(new WhatsappNotifier());
		 try {
		account.Withdraw(1000000);
		 } catch (InsufficientBalanceException e) {
		 e.printStackTrace();
		 }
		account.deposit(30000);

	}

}
