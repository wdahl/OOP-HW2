package edu.albany.hw2.stock;

//stock class to represent a stock's symbol, name, and price
public class Stock {
	//Symbol the represents the stock for a company
	public enum Symbol {
		MSFT("Microsoft"), 
		AAPL("Apple"), 
		GOOGL("Google"), 
		AMZN("Amazon"), 
		T("AT&T");
		
		//name of the company
		private final String name;
		
		//Symbol constructor to set name associated whit the symbol
		Symbol(String name) {
			this.name = name;
		}
		
		//returns the name associated with the symbol
		public String getName() {
			return name;
		}
	}
	
	//instance fields
	private Symbol symbol;// symbol of the stock
	private double previousClosingPrice; //previous price of the stock
	private double currentPrice; //Current price
	
	//stock constructor 
	Stock(){
		symbol = null;
		previousClosingPrice = 0.0;
		currentPrice = 0.0;
	}
	
	//intalizes the symbol of the stock
	Stock(Symbol symbol) {
		this.symbol = symbol;
	}
	
	//gets the previous closing price of the stock
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	//gets the current price
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	//gets the symbol fo the stock
	public Symbol getSymbol() {
		return symbol;
	}

	//sets the symbol of the stock
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	//sets the previous closing stock
	public void setPreviousClosingPrice(double price) {
		previousClosingPrice = price;
	}
	
	//sets the current price
	public void setCurrentPrice(double price) {
		currentPrice = price;
	}
	
	//gets the percent change of the stock
	public double getChangePercent() {
		//gets the diffrence between the current price and the previous price
		double diffrence = currentPrice - previousClosingPrice;
		
		//gets the percent change
		double change = diffrence / previousClosingPrice;
		double percent = change * 100;
		return percent;
	}

	
	
	
}
