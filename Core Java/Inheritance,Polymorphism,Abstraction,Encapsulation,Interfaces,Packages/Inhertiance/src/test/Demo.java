package test;
import types.Bike;
public class Demo {

	public static void main(String[] args) {
		Bike bike = new Bike("long","diesel",4,4,40,"LED");
		System.out.println("Handle type:-"+" "+bike.getHandle());
		System.out.println("Engine type:-"+" "+bike.getEngine());
		System.out.println("Number of seats:-"+" "+bike.getSeats());
		System.out.println("Fuel tank capacity in litres:-"+" "+bike.getFuelTank());
		System.out.println("Lights used"+" "+bike.getLights());
		bike.run(); //run() method of class Bike will be invoked 
	
	}

}
