package com.aurionpro.model;

public class MahindraFactory implements ICarFactory {

private static ICarFactory mahindraFactory;
	
	private MahindraFactory() {
		
		
	}
	
	public static ICarFactory getMahindraFactoryInstance() {
		if(mahindraFactory == null) {
			mahindraFactory = new MahindraFactory();
		}
		return mahindraFactory;
	}
	
	@Override
	public ICars makecar() {
		return new Mahindra();
		
	}


}
