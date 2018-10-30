package com.handsoncoder.designpatterns.abstractfactorypattern;

public abstract class AbstractPhoneFactory {
	public static OSFactory getFactory(OSType osType) {
		switch (osType) {
		case WINDOWS:
			return new WindowsFactory();
		case ANDROID:
			return new AndroidFactory();
		default:
			return null;
		}
	}
}
