package com.handsoncoder.designpatterns.observerpattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public double ibmPrice;
	public double aaplPrice;
	public double googPrice;

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public double getAaplPrice() {
		return aaplPrice;
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

	public void register(Observer newObserver) {
		observers.add(newObserver);
		System.out.println("Registered a New Observer");
	}

	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		observers.remove(observerIndex);
		System.out.println("UnRegistered a New Observer");

	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
		System.out.println("Notified observers");
	}
}
