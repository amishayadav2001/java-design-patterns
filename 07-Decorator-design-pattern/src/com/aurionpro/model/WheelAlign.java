package com.aurionpro.model;

public class WheelAlign extends CarServiceDecorator {

	public WheelAlign(ICarService carObj) {
		super(carObj);
	}
	
	public double getCost() {
		return 400 + super.getCost();
	}

}
