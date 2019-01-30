package com.kpcorp.designpatterns.factory;

import java.util.Scanner;

public class FactoryMain {

	public static void main(String[] args) {
		// OS os = new Android();
		// os.spec();
		// Operating System object is exposed at the Client end
		System.out.println("Enter the type of OS :");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		OperatingSystemFactory osf = new OperatingSystemFactory();
		System.out.println("The OS speciality is :  ");
		osf.getInstance(input).spec();
		
	}

}
