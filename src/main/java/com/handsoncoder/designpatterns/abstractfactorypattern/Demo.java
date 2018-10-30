package com.handsoncoder.designpatterns.abstractfactorypattern;

public class Demo {
	public static void main(String[] args) {

		OSFactory factory = AbstractPhoneFactory.getFactory(OSType.ANDROID);
		Phone pixelPhone = factory.create(ManufacturerType.GOOGLE);
		pixelPhone.display();

		OSFactory wfactory = AbstractPhoneFactory.getFactory(OSType.WINDOWS);
		Phone nokiaPhone = wfactory.create(ManufacturerType.NOKIA);
		nokiaPhone.display();
	}
}
