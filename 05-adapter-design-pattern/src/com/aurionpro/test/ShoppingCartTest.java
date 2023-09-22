package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.IItems;
import com.aurionpro.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cartObj = new ShoppingCart();
		cartObj.addItemtoCart(new Biscuit("Monaco", 11));
		cartObj.addItemtoCart(new HatAdapter(new Hat("Summer", "Designer cotton caps", 400, 11)));

		System.out.println(cartObj.getCartPrice());

		System.out.println(cartObj.getCartItems());

		displayCartItems(cartObj);
		System.out.println("-----------------------------------------");
		System.out.println("Total Cart Price : " + cartObj.getCartPrice());

	}

	private static void displayCartItems(ShoppingCart cart) {
		List<IItems> cartList = cart.getCartItems();
		for (IItems i : cartList) {
			System.out.println("Item Name : " + i.getItemName());
			System.out.println("Item Price : " + i.getItemPrice());
		}

	}

}
