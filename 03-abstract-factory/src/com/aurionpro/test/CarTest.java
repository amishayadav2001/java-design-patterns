package com.aurionpro.test;

import com.aurionpro.model.ICarFactory;
import com.aurionpro.model.ICars;
import com.aurionpro.model.MarutiFactory;
import com.aurionpro.model.TataFactory;

public class CarTest {

	public static void main(String[] args) {
		ICarFactory marutiCarFactory = MarutiFactory.getMarutiFactoryInstance();
		ICars maruti = marutiCarFactory.makecar();
		maruti.start();
		maruti.stop();

		ICarFactory tataCarFactory = TataFactory.getTataFactoryInstance();
		ICars tata = tataCarFactory.makecar();
		tata.start();
		tata.stop();

	}

}
