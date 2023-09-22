package com.aurionpro.model;

public class ConcretePrototype1 implements Prototype {
	private String property;

	public ConcretePrototype1(String property) {
		this.property = property;
	}

	@Override
	public Prototype clone() {
		return new ConcretePrototype1(this.property);
	}

	public String getProperty() {
		return property;
	}

}
