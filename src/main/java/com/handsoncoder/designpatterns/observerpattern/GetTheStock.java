package com.handsoncoder.designpatterns.observerpattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

	private String stock;
	private double price;

	private Subject stockGrabber;

	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {

		this.stockGrabber = stockGrabber;

		stock = newStock;
		price = newPrice;

	}

	public void run() {

		for (int i = 1; i <= 20; i++) {

			try {

				// Sleep for 2 seconds
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			// Generates a random number between -.03 and .03

			double randNum = (Math.random() * (.06)) - .03;

			// Formats decimals to 2 places

			DecimalFormat df = new DecimalFormat("#.##");

			price = Double.valueOf(df.format((price + randNum)));

			if (stock == "IBM")
				((StockGrabber) stockGrabber).setIbmPrice(price);
			if (stock == "AAPL")
				((StockGrabber) stockGrabber).setAaplPrice(price);
			if (stock == "GOOG")
				((StockGrabber) stockGrabber).setAaplPrice(price);

			System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));

			System.out.println();

		}
	}
}
