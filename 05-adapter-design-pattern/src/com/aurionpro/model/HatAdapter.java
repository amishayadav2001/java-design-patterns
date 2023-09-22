package com.aurionpro.model;

public class HatAdapter implements IItems {
	private Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		return hat.getLongName();

	}

	@Override
	public double getItemPrice() {
		//return this.getItemPrice() + hat.getBasicPrice() * hat.getTax() / 100;
		return hat.getBasicPrice() * (hat.getTax()*0.01*hat.getBasicPrice());
	}

	@Override
	public String toString() {
		return "HatAdapter [hat=" + hat + "]";
	}

}
