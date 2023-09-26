package edu.monmouth;

public class Problem3Week3 {

	public static void main(String[] args) {
		Car myHybrid = new Car(50); // 50 miles per gallon
		
		myHybrid.addGas(20); // Tank 20 gallons
		myHybrid.drive(100); // Drive 100 miles
		double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank
		
		System.out.println(gasLeft);
	}

}

class Car {
	 private double fuelEfficiency;  // Miles per gallon
	    private double fuelInTank;     
	    

	    // Constructor to initialize the fuel efficiency
	    public Car(double efficiency) {
	        this.fuelEfficiency = efficiency;
	        this.fuelInTank = 0;
	    }

	    // Simulate driving for a certain distance and update fuel level
	    public void drive(double distance) {
	        double fuelConsumed = distance / fuelEfficiency;
	        fuelInTank = fuelInTank - fuelConsumed;
	    }

	    // Return the current amount of gasoline in the fuel tank
	    public double getGasInTank() {
	        return fuelInTank;
	    }

	    // Add gasoline to the fuel tank
	    public void addGas(double gallons) {
	        fuelInTank = fuelInTank + gallons;
	    }
}