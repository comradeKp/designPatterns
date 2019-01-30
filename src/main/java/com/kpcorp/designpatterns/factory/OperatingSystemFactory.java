package com.kpcorp.designpatterns.factory;

public class OperatingSystemFactory {

	public OS getInstance(String input) {
		if("andr".equals(input)) {
			return new Android();
		} else if("ios".equals(input)) {
			return new IOS();
		} else {
			return new Windows();
		}
}
}
