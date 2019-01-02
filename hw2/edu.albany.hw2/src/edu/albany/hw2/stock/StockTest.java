package edu.albany.hw2.stock;

public class StockTest {
	public static void main(String args[]) {
		//sets stock1 to be Microsoft
		Stock.Symbol symbol1 = Stock.Symbol.MSFT;
		Stock stock1 = new Stock(symbol1);
		
		//sets the previous price and current price and then prints the percent change
		stock1.setPreviousClosingPrice(58.9);
		stock1.setCurrentPrice(59);
		System.out.printf("Price change percentage for %s: %.2f\n",stock1.getSymbol().getName(), stock1.getChangePercent());
		
		//sets stock2 to be google
		Stock.Symbol symbol2 = Stock.Symbol.GOOGL;
		Stock stock2 = new Stock(symbol2);
		
		//sets the fields for stock2 and prints the percent change
		stock2.setPreviousClosingPrice(50);
		stock2.setCurrentPrice(60);
		System.out.printf("Price change percentage for %s: %.2f\n",stock2.getSymbol().getName(), stock2.getChangePercent());
	}
}
