package com.handsoncoder.designpatterns.strategypattern;

public class CantFly implements Flys {

	public void fly() {
		System.out.println("Are you serious? I can not fly");
	}
}
