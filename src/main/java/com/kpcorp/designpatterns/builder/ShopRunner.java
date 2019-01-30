package com.kpcorp.designpatterns.builder;

public class ShopRunner {

	public static void main(String[] args) {
//		Phone p = new Phone("Andrid", 2, "Qualcom", 5.5, 31000);
//		System.out.println("Phone Details : "+p.toString());
		Phone p = new PhoneBuilder().setOs("Android").setBattery(1300).getPhone();
		System.out.println("Phone Details: "+p);
	}

}
