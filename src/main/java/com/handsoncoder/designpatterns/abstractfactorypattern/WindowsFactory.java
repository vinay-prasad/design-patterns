package com.handsoncoder.designpatterns.abstractfactorypattern;

public class WindowsFactory implements OSFactory {

	public Phone create(ManufacturerType manufacturerType) {
		switch (manufacturerType) {
		case LENONVO:
			return new LenovoPhone();
		case NOKIA:
			return new NokiaPhone();
		default:
			return null;
		}
	}
}
