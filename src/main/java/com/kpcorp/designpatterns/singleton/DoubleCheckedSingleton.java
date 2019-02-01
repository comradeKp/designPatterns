package com.kpcorp.designpatterns.singleton;

//Double checked locking: Making the synchronised block only in the required place rather than for the whole method.
//This reduces the execution time when compared to making the whole method Synchronized
public class DoubleCheckedSingleton {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Ab obj = Ab.getInstace();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Ab obj1 = Ab.getInstace();
			}
		});
		t1.start();
		t2.start();
	}
}

class Ab {
	private static Ab obj;

	private Ab() {
		System.out.println("Instace Created");
	}

	public static Ab getInstace() {
		if (null == obj) {
			synchronized (Ab.class) {
				if (null == obj)
					obj = new Ab();
			}
		}
		return obj;
	}
}
