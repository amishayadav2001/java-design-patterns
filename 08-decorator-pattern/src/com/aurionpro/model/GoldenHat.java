package com.aurionpro.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
	}

	@Override
	public double getPrice() {
		return 400 + super.getprice();
	}

}
