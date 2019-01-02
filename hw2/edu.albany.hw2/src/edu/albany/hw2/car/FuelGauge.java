package edu.albany.hw2.car;

//Models the fuel gauge of a car
public class FuelGauge {
	//current fuel in the car
	private int currentFuel;
	//Max amount of fuel that the car can hold
	private final int MAXGALLONS = 15;
	
	//Default constructor for the fuel gauge
	FuelGauge(){
		currentFuel = 0;
	}
	
	//intalizes the fuel gauge with a fuel amount
	FuelGauge(int fuel){
		//if the amount given is larger than the max 
		//gallons that can be conitained the fuel amount 
		//is set to the max
		if(fuel <= MAXGALLONS) {
			currentFuel = fuel;
		}
		
		else {
			currentFuel = MAXGALLONS;
		}
	}
	
	//returns the current fuel amount
	public int getCurrentFuel() {
		return currentFuel;
	}
	
	//incremnts the fuel amount by 1
	public void incrementFuelGauge() {
		if(!isFull()) {
			currentFuel++;
		}
	}
	
	//decrements the fuel amount by one
	public void decrementFuelGauge() {
		if(!isEmpty()) {
			currentFuel--;
		}
	}
	
	//checks if the fuel tank is full
	public boolean isFull() {
		return currentFuel == MAXGALLONS;
	}
	
	//checks if the full tank is empty
	public boolean isEmpty() {
		return currentFuel == 0;
	}
}
