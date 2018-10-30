package com.handsoncoder.designpatterns.abstractfactorypattern;

public interface OSFactory {
	
	Phone create (ManufacturerType manufacturerType);
}
