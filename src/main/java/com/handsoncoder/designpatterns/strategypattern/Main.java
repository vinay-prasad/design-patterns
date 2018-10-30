package com.handsoncoder.designpatterns.strategypattern;

public class Main {

	public static void main(String[] args) {
		Animal eddie = new Dog();
		eddie.tryToFly();

		Animal kuku = new Parrot();
		kuku.tryToFly();
	}
}
