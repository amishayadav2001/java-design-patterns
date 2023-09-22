package com.aurionpro.model;

public class ConcretePrototype2 implements Prototype {
	private int value;

	public ConcretePrototype2(int value) {
		this.value = value;
	}

	@Override
	public Prototype clone() {
		return new ConcretePrototype2(this.value);
	}

	public int getValue() {
		return value;
	}
}
