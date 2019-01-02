package edu.albany.hw2.morse;

import java.util.Scanner;

//program that asks the user to enter a string and then converts that string into Morse code.
public class MorseCodeGenerator {
	public static void main(String[] args) {
		//instance of the morse code map
		MorseCodeMap map = new MorseCodeMap();
		//scanner to get user input
		Scanner scan = new Scanner(System.in);
		//holds the message to be encoded
		StringBuffer buffer = new StringBuffer();
		
		//checks if arguments given via the command line exceed one
		//handles the error
		if(args.length > 1) {
			System.out.println("Error: Usage: MorseCodeGenerator takes a single string");
			System.out.println("          Ex: java MorseCodeGenerator \"[String]\"");
		}
		
		//if user uses command line arguments it puts the string given into the buffer
		if(args.length == 1) {
			buffer.append(args[0]);
		}
		
		//if user does not give command line arguments
		else {
			//gets the user input
			System.out.println("Enter the messgae to be encoded: ");
			buffer.append(scan.nextLine());
			scan.close();
		}
		
		//generates the code using the map
		map.generateCode(buffer);
	}
}
