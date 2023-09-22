package com.aurionpro.model;

public abstract class Shape {

	public Color color;

	public Shape(Color c) {
		this.color = c;
	}

	abstract public void applyColor();

}
