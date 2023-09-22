package com.aurionpro.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel h1 = new IndianHotel();
		IMenu menu = h1.getMenu();
		menu.displayMenu();

	}

	public void getItalianMenu() {
		IHotel h2 = new ItalianHotel();
		IMenu menu = h2.getMenu();
		menu.displayMenu();

	}

	public void getChineseMenu() {
		IHotel h3 = new ChineseHotel();
		IMenu menu = h3.getMenu();
		menu.displayMenu();

	}
}
