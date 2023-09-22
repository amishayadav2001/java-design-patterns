package com.aurionpro.model;

public class MarutiFactory implements ICarFactory {
	
	private static ICarFactory marutiFactory;
	
	private MarutiFactory() {
		
		
	}
	
	public static ICarFactory getMarutiFactoryInstance() {
		if(marutiFactory == null) {
			marutiFactory = new MarutiFactory();
		}
		return marutiFactory;
	}
	
	@Override
	public ICars makecar() {
		return new Maruti();
		
	}

}
