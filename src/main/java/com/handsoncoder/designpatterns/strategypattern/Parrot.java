package com.handsoncoder.designpatterns.strategypattern;

public class Parrot extends Animal {

	public Parrot () {
		super();
		setFlyingType(new ItFlies());
	}
}
