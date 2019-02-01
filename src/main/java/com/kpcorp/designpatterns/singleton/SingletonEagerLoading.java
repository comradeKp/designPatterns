package com.kpcorp.designpatterns.singleton;

public class SingletonEagerLoading {

	public static void main(String[] args) {
		A abc = A.getInstace();
		A abc1 = A.getInstace();
		A abc2 = A.getInstace();
		// abc.sayHello();
	}

}

class A {
	private static A obj = new A(); // Object initialisation in Eager form

	private A() {
		System.out.println("Instace Created");
	}

	public static A getInstace() {
		return obj;
	}

}