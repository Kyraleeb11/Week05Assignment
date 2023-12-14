package com.promineotech;


public class AsteriskLogger implements Logger {
//implemented the AsteriskLogger class to the Logger interface
	
	
	//this is an overridden method that implements logger interface
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
		//taking in a string and printing out 3 asterisk on each side
	}
	@Override
	public void error(String message1) {
		try {
			System.out.println("*****************");
			System.out.println("***Error: " + message1 + "***");
			System.out.println("*****************");
	}
		catch(Exception e) {
			System.out.println("An error occurred in the error method: " + e.getMessage());	
	
		}
	}}
	


