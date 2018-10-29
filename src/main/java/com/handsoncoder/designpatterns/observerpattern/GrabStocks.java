package com.handsoncoder.designpatterns.observerpattern;

public class GrabStocks {

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver stockObserver1 = new StockObserver(stockGrabber);
		StockObserver stockObserver2 = new StockObserver(stockGrabber);

		// first notification
		stockGrabber.setIbmPrice(100.10);
		stockGrabber.setAaplPrice(110.10);
		stockGrabber.setGoogPrice(120.10);

		// second notification
		stockGrabber.setIbmPrice(100.10);
		stockGrabber.setAaplPrice(110.10);
		stockGrabber.setGoogPrice(120.10);

		// Thread version

		// Create 3 threads using the Runnable interface
		// GetTheStock implements Runnable, so it doesn't waste
		// its one extendable class option

		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);

		// Call for the code in run to execute

		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
	}

}
