package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.PremiumHat;
import com.aurionpro.model.RibonedHat;
import com.aurionpro.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
//		IHat hat = new StandardHat();
//		GoldenHat goldHat = new GoldenHat(hat);
//		RibonedHat ribbonHat = new RibonedHat(goldHat);
//		System.out.println(goldHat.getName());
//		System.out.println(goldHat.getPrice());

		StandardHat standard = new StandardHat();
		GoldenHat golden = new GoldenHat(standard);
		RibonedHat riboned = new RibonedHat(golden);

		System.out.println(riboned.getName());
		System.out.println(riboned.getPrice());
		
		PremiumHat premium = new PremiumHat();
		GoldenHat goldenhat = new GoldenHat(premium);
		RibonedHat ribonedhat = new RibonedHat(goldenhat);

		System.out.println(ribonedhat.getName());
		System.out.println(ribonedhat.getPrice());


	}

}
