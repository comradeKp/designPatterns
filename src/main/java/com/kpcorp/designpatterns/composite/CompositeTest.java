package com.kpcorp.designpatterns.composite;

public class CompositeTest {

	public static void main(String[] args) {
		Components mouse = new Leaf("mouse", 100);
		Components keyboard = new Leaf("keyboard", 150);

		Components ram = new Leaf("RAM", 100);
		Components cpu = new Leaf("CPU", 150);
		Components hd = new Leaf("HardDrive", 150);

		Composite cabinet = new Composite("Cabinet");
		Composite periferals = new Composite("Periferals");
		Composite motherBoard = new Composite("Mother Board");

		Composite computer = new Composite("Computer");

		cabinet.addComponent(hd);
		motherBoard.addComponent(ram);
		motherBoard.addComponent(cpu);
		periferals.addComponent(mouse);
		periferals.addComponent(keyboard);
		cabinet.addComponent(motherBoard);
		computer.addComponent(cabinet);
		computer.addComponent(periferals);

//		computer.showPrice();
		computer.showPrice();
	}

}
