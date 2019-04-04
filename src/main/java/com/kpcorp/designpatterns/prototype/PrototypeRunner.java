package com.kpcorp.designpatterns.prototype;

public class PrototypeRunner {
	// Prototype: Used when Object creation is an expensive exercise
	// and it is easier to clone the object than to fect or create it from DB
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("BookShop1");
		bs.loadData();
		BookShop bs1 = bs.clone();
		bs.getBookList().remove(0);
		System.out.println(bs);
		System.out.println(bs1);
		// Shallow Cloning : Cloning doesnot create a new object . There is only
		// one object and two references.
		// Deep Cloning : Cloning creates a different object
	}
	
//	Design Pattern of createing multiple copies or clones of an oject from its prototype.
//	Creational Design Pattern

}
