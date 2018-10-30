package com.handsoncoder.designpatterns.strategypattern;

public class Animal {

	Flys flyingType;

	public void tryToFly() {
		flyingType.fly();
	}

	public void setFlyingType(Flys newFlyType) {
		flyingType = newFlyType;
	}

}
