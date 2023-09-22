package com.aurionpro.test;

import com.aurionpro.model.CreditCardStrategy;
import com.aurionpro.model.Item;
import com.aurionpro.model.PaypalStrategy;
import com.aurionpro.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		cart.pay(new PaypalStrategy("amu@gmail.com", "mypwd"));

		cart.pay(new CreditCardStrategy("Amisha Yadav", "1234567890123456", "786", "12/15"));
	}

}
