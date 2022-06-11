package oop;

public class Car {
	
		//instance variables
		private String doors;
		private String engine;
		private String driver;
		private int speed;
		
		//constructor
		public Car() {
			doors="opened";
			engine="off";
			driver="absent";
			speed=0;
			
		}
		
	//parameterized constructor	
	public Car(String doors, String engine, String driver, int speed) {
			
			this.doors = doors;
			this.engine = engine;
			this.driver = driver;
			this.speed = speed;
		}
	
	//getters and setters
    public int getSpeed() {
    	return speed;
    }
	public String getDoors() {
		return doors;
	}
	public String getEngine() {
		return engine;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0 ) {
			return "The car is in running state";
		}
		else {
			return "The car is not running";
		}
	}
    
	}
