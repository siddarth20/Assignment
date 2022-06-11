package types;
import vehicle.Vehicle;
public class Bike extends Vehicle //class Bike inherits properties of class Vehicle
{
private String handle;

public Bike() {
	super();
	this.handle="short";
}

public Bike(String handle,String engine, int wheels, int seats, int fuelTank, String lights) {
	super(engine,wheels,seats,fuelTank,lights);
	this.handle = handle;
}

public String getHandle() {
	return handle;
}

//String representation of an object
@Override
public String toString() {
	return "bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
			+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights() + "]";
}

public void run() {
	System.out.println("Running bike");
	System.out.println(toString());
	
}

}
