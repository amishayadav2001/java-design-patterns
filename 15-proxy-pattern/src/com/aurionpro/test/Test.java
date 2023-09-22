package com.aurionpro.test;

import com.aurionpro.model.IInternet;
import com.aurionpro.model.ProxyInternet;

public class Test {
	public static void main(String[] args) {
		IInternet proxyInternet = new ProxyInternet();
		proxyInternet.connectTo("www.flipkart.com");
		System.out.println("-----------------------");
		proxyInternet.connectTo("www.geeksforgeeks.com");
	}
}
