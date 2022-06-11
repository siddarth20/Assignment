package com.throwskeyword;

import java.util.Scanner;

class OutOfPaperException extends Exception{
	
	String errorMessage;
	
	OutOfPaperException(String errorMessage){
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "OutOfPaperException [errorMessage=" + errorMessage + "]";
	}
	
}

class StateException extends Exception{
	
	String errorMessage;
	
	StateException(String errorMessage){
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "StateException [errorMessage=" + errorMessage + "]";
	}
	
}

class Device{
	private String state="off";
	private String deviceName="HP Printer";
	
	void checkState()throws StateException {
		if(state=="off") {
			throw new StateException("Please switch on printer first!");
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDeviceName() {
		return deviceName;
	}

}

public class Printer extends Device{
	static int pagesLeft = 2;
	static int choice;
	void printPage(int numberOfPages)throws OutOfPaperException {
		if(pagesLeft==0) {
			throw new OutOfPaperException("Please add more paper!");
		}
		else {
			pagesLeft-=numberOfPages;
			System.out.println("Page is printed");
		}
		
	}
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		Printer printer = new Printer();
		System.out.println(printer.getDeviceName());
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Print page");
			if(printer.getState()=="on") {
				System.out.println("2. Switch off printer");
			}
			else {
				System.out.println("2. Switch on printer");
			}
			System.out.println("3. Exit platform");
		    choice = se.nextInt();
		switch(choice) {
		
		case 1: 
			try {
				printer.checkState();
			} catch (StateException e1) {
				System.out.println(e1);
				break;
			}
			try {
				printer.printPage(1);
			} catch (OutOfPaperException e) {
				System.out.println(e);
			}
			break;
		case 2: 
			if(printer.getState()=="on") {
				printer.setState("off");
			}
			else {
				printer.setState("on");
			}
			break;
		case 3:
			System.exit(0);
		}
	}while(choice!=3);
}
}