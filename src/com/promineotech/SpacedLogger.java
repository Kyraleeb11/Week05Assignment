package com.promineotech;

public class SpacedLogger implements Logger {

	//overrides the log method to display the message with spaces between the characters in the message 
	@Override
	public void log(String message) {
		System.out.println(addSpaces(message));
		
	}
	//overrides the error method to display the error message with spaces between the characters 
	@Override
	public void error(String message1) {
		System.out.println("ERROR: " + addSpaces(message1));
	}
	//this method is taking a String and returns a StringBuilder with spaces added between each character

	private StringBuilder addSpaces(String word) {
		
		StringBuilder spacedString = new StringBuilder();
		for(int i = 0; i < word.length(); i++) {
	
				spacedString.append(word.charAt(i));
				spacedString.append(' ');
		}
			return spacedString;
			}
	}

