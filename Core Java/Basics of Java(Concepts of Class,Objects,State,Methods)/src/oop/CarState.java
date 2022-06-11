package oop;

public class CarState {

	public static void main(String[] args) {
		//Car car = new Car();
		Car car = new Car("closed","on","seated",10); //call to parameterized constructor
		//car.setDoors("closed");
		//car.setDriver("seated");
		//car.setEngine("on");
		//car.setSpeed(10);
		//testing getter and setter methods
		String status = car.run();
		System.out.println(status);

	}

}