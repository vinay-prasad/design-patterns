package com.handsoncoder.designpatterns.decoratorpattern;

public class Main {

	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("ingredients : " + basicPizza.getDescription());
		System.out.println("cost : " + basicPizza.getCost());
	}
}
