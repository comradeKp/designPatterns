package com.kpcorp.designpatterns.singleton;

//Only for java 1.5 and above
public class SingletonEnumDemo {

	public static void main(String[] args) {
		Abcd a = Abcd.INSTANCE;
		a.i = 5;
		a.show();
		Abcd b = Abcd.INSTANCE;
		b.i = 6;
		a.show();
		b.show();
	}
}

enum Abcd {
	INSTANCE;
	int i;

	public void show() {
		System.out.println("i =" + i);
	}
}