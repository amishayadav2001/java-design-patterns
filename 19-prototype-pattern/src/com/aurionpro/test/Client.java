package com.aurionpro.test;

import com.aurionpro.model.ConcretePrototype1;
import com.aurionpro.model.ConcretePrototype2;
import com.aurionpro.model.Prototype;

public class Client {
	  public static void main(String[] args) {
	        Prototype prototype1 = new ConcretePrototype1("Prototype 1");
	        Prototype prototype2 = new ConcretePrototype2(11);

	        Prototype clonedPrototype1 = prototype1.clone();
	        Prototype clonedPrototype2 = prototype2.clone();

	        System.out.println("Cloned Prototype 1 Property: " + ((ConcretePrototype1) clonedPrototype1).getProperty());
	        System.out.println("Cloned Prototype 2 Value: " + ((ConcretePrototype2) clonedPrototype2).getValue());
	    }

}
