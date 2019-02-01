package com.kpcorp.designpatterns.singleton;

//But Sychonised will reduce the performnace bt a factor of 100
//Syncshronisation -  the second thread waits until the first thread finishes
//Solution = Double checked Locking -Using bouble checked blocks
public class SingletonSynchronized {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				B obj = B.getInstace();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				B obj1 = B.getInstace();
			}
		});
		t1.start();
		t2.start();
	}
}

class B {
	private static B obj;

	private B() {
		System.out.println("Instace Created");
	}

	public static synchronized B getInstace() {
		if (null == obj) {
			obj = new B();
		}
		return obj;
	}
}
