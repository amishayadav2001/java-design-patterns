package com.aurionpro.model;

public class RibonedHat extends HatDecorator {

	public RibonedHat(IHat hat) {
		super(hat);
	}

	@Override
	public double getPrice() {
		return 600 + super.getprice();
	}

}
