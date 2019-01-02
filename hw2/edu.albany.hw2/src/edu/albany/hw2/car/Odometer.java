package edu.albany.hw2.car;

//models a odometer in a car
public class Odometer {
	//current milage the car has travled
	private int currentMilage;
	//allows the odometer to work with the fuel gauge
	private FuelGauge fuelGauge = new FuelGauge();
	//Max amount miles the odometer can display
	private final int MAXMILAGE = 999999;
	//the fuel economy of the car
	private final int MPG = 22;
	//count of miles travled until the fuel gauge needs to be decremented
	private int MPGCount = 0;
	
	//default constrctor for the odometer
	Odometer(){
		currentMilage = 0;
	}
	
	//intalizes the odometer with a specifeic value
	Odometer(int milage){
		//if the value given exeeceds the max amount of the odometer can display
		//the diffrence between the value given and the Max milage
		//is calculated, this calculation is done until milage is less than the max milage
		//to get the milage that could be displayed on the odometer
		if(milage <= MAXMILAGE) {
			currentMilage = milage;
		}
		
		else {
			while(milage > MAXMILAGE) {
				milage = milage - MAXMILAGE;
			}
			
			currentMilage = milage;
		}
	}
	
	//returns the current milage 
	public int getCurrentMilage() {
		return currentMilage;
	}
	
	//sets the fuelGauge that the odmeter will work with for automating
	//the decrementing of the fuel gauge
	public void setFuelGauge(FuelGauge gauge) {
		fuelGauge = gauge;
	}
	
	//incriments the odometer
	public void incrementOdometer() {
		//checks if the fuel tank is empty
		if(!fuelGauge.isEmpty()) {
			//automates the decremnting of the fuel gauge when 22 miles have 
			//been driven
			automatedFuelGauge();
			
			//changes the current milage to 0 of the max milage that can 
			//be displayed is exceeded
			if(currentMilage == MAXMILAGE) {
				currentMilage = 0;
			}
			
			//incremnts the odometer
			else {
				currentMilage++;
			}
		}
		
		//if the fuel tank is empty
		//prints message that the car is empty and does not 
		//increment the odometer
		else {
			System.out.println("Car is Empty");
		}
	}
	
	//automates the decrementing of the fule gauge when
	//22 miles has been driven
	public void automatedFuelGauge() {
		//increments the milage count tward the 22 MPG
		MPGCount++;
		
		//if the milage count is eqaul to the mpg
		//the fule gauge is decremented and
		//the milafe count is set back to 0
		if(MPGCount == MPG) {
			fuelGauge.decrementFuelGauge();
			MPGCount = 0;
		}
	}
}
