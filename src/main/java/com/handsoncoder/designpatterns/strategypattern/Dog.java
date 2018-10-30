package com.handsoncoder.designpatterns.strategypattern;

public class Dog extends Animal {

	public Dog () {
		super();
		setFlyingType(new CantFly());
	}
}
