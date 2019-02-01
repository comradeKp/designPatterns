package com.kpcorp.designpatterns.singleton;

public class SingletonLazy {

	public static void main(String[] args) {
		Abc abc = Abc.getInstace();
		Abc abc1 = Abc.getInstace();
		Abc abc2 = Abc.getInstace();
		
		// abc.sayHello();
	}

}

class Abc {
	private static Abc obj; //Object initialisation in lazy form( not eager)

	private Abc() {
		System.out.println("Instace Created");
	}

	public static Abc getInstace() {
//		This causes problem when the method gets called by multiple threads at the same time
		if (null == obj) {
			obj = new Abc();
		}
		return obj;
	}


}