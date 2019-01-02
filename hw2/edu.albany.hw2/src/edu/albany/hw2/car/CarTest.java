package edu.albany.hw2.car;

//test the FuleGauge and Odometer Classes
//by simulating a car being filled and then droven until empty
public class CarTest {
	public static void main(String[] args) {
		//creates the instances of the FuelGauge and Odometer classes
		FuelGauge fuelGauge = new FuelGauge();
		Odometer odometer = new Odometer();
		
		//sets the fuel gauge that the odmeter works with tot he fuel gauge just created
		odometer.setFuelGauge(fuelGauge);
		
		//fills the fuel tank of the car
		while(!fuelGauge.isFull()) {
			fuelGauge.incrementFuelGauge();
		}
		
		//prints out the starting milage and fulefor the car
		System.out.println("Car is full!");
		System.out.printf("Curren Milage: %d miles\n", odometer.getCurrentMilage());
		System.out.printf("Current fuel: %d gallons\n", fuelGauge.getCurrentFuel());

		//simulates driving the car until it is empty
		while(!fuelGauge.isEmpty()) {
			//incremetns the odometer
			odometer.incrementOdometer();
			
			//prints out he curren fuel amount and milage travled
			System.out.println("-------------------------------------");
			System.out.printf("Curren Milage: %d miles\n", odometer.getCurrentMilage());
			System.out.printf("Current fuel: %d gallons\n", fuelGauge.getCurrentFuel());
		}
		
		//The car is now empty
		System.out.println("Car is Empty!");
	}
}
