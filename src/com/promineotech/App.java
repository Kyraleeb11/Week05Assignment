package com.promineotech;

public class App {
		//has a main method
	public static void main(String[] args) {
		
		String word = "Hello";
		
		//creating an instance called astLog using the AsteriskLogger class, passing in the word to the log and error function
		Logger astLog = new AsteriskLogger();
		System.out.println("Asterisk Logger: ");
		astLog.log(word);
		astLog.error(word);
		
		Logger spcLog = new SpacedLogger();
		System.out.println("\nSpaced Logger: ");
		spcLog.log(word);
		spcLog.error(word);
	//created another instance called spcLog which uses the spacelogger
	//class which prints out the word with spaces in between each 
	//character
	}

}
//log printing out the hello with the 3 asterisks on each side 
//and the error method is printing the string enclosed in a box
//of asterisks with the error message