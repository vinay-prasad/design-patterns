package com.handsoncoder.designpatterns.abstractfactorypattern;

import java.awt.image.SampleModel;

public class AndroidFactory implements OSFactory {

	public Phone create(ManufacturerType manufacturerType) {
		switch (manufacturerType) {
		case GOOGLE:
			return new GooglePhone();
		case SAMSUNG:
			return new SamsungPhone();
		default:
			return null;
		}
	}
}
