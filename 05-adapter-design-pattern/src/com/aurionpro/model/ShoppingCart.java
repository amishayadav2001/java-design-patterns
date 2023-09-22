package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
	List<IItems> cartItems;
	
	public ShoppingCart() {
		this.cartItems = new ArrayList<IItems>();
	}
	
	public List<IItems> getCartItems(){
		return cartItems;
	}

//	public ShoppingCart(List<IItems> cartItems) {
//		super();
//		this.cartItems = cartItems;
//	}
	
	public void addItemtoCart(IItems item) {
		this.cartItems.add(item);		
	}
	
	public double getCartPrice() {
		return this.cartItems.stream().collect(Collectors.summingDouble(IItems::getItemPrice));
	}

	@Override
	public String toString() {
		return "ShoppingCart [cartItems=" + cartItems + "]";
	}

}
