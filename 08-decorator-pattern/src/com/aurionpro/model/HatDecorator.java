package com.aurionpro.model;

public abstract class HatDecorator implements IHat{
	
	private IHat hat;

	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}
	
	public String getName() {
		return hat.getName();
		
	}
	
	public double getprice() {
		return hat.getPrice();
		
	}
	

}
