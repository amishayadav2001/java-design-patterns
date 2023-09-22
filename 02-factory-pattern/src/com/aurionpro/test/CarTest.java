package com.aurionpro.test;

import com.aurionpro.model.CarFactory;
import com.aurionpro.model.CarType;
import com.aurionpro.model.ICars;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();

		ICars maruti = factory.getCarInstance(CarType.Maruti);

		if (maruti != null) {
			maruti.start();
			maruti.stop();

		}

		ICars tata = factory.getCarInstance(CarType.Tata);

		tata.start();
		tata.stop();

	}

}
