package com.aurionpro.model;

public class TataFactory implements ICarFactory {
	private static ICarFactory tataFactory;

	private TataFactory() {
		
		
	}

	public static ICarFactory getTataFactoryInstance() {
		if (tataFactory == null) {
			tataFactory =  new TataFactory();
		}
		return tataFactory;
	}

	@Override
	public ICars makecar() {
		return new Tata();

	}

}
