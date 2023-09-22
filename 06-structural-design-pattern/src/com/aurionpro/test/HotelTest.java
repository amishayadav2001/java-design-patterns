package com.aurionpro.test;

import com.aurionpro.model.HotelReception;

public class HotelTest {

	public static void main(String[] args) {
		HotelReception reception = new HotelReception();

        reception.getIndianMenu();

        System.out.println("---------------------------------");
        reception.getItalianMenu();

        System.out.println("---------------------------------");
        reception.getChineseMenu();

	}

}
