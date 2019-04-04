package com.kpcorp.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class ComputerParts {
}

interface Components {

	void showPrice();
}

class Leaf implements Components {
	String name;
	int price;

	@Override
	public void showPrice() {
		System.out.println(name + ":" + price);
	}

	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

class Composite implements Components {
	String name;
	List<Components> components = new ArrayList<>();

	public void addComponent(Components component) {
		components.add(component);
	}

	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name + "\n");
		for (Components component : components) {
			component.showPrice();
		}
	}

}
