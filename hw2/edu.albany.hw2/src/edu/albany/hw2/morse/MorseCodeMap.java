package edu.albany.hw2.morse;

import java.util.HashMap;

// Mapping of characters to their representation in morse code
public class MorseCodeMap {
	//declares the morse code map as a hashMap with an id of type string and a value of type string
	private HashMap<String, String> morseCodeMap = new HashMap<String, String>();
	
	//intalizes the values and the keys of the morse code map when a new map in made
	//I used a Hash map because threading syncrnization for this program was not important
	//and a hash map is faster as oppose to a hash table
	//thus using a hash map was a better choice for this project.
	MorseCodeMap(){
		morseCodeMap.put(" ", " ");
		morseCodeMap.put(",", "--..--");
		morseCodeMap.put(".", ".-.-.-");
		morseCodeMap.put("?", "..--..");
		morseCodeMap.put("0", "-----");
		morseCodeMap.put("1", ".----");
		morseCodeMap.put("2", "..---");
		morseCodeMap.put("3", "...--");
		morseCodeMap.put("4", "....-");
		morseCodeMap.put("5", ".....");
		morseCodeMap.put("6", "-....");
		morseCodeMap.put("7", "--...");
		morseCodeMap.put("8", "---..");
		morseCodeMap.put("9", "----.");
		morseCodeMap.put("A", ".-");
		morseCodeMap.put("B", "-...");
		morseCodeMap.put("C", "-.-.");
		morseCodeMap.put("D", "-..");
		morseCodeMap.put("E", ".");
		morseCodeMap.put("F", "..-.");
		morseCodeMap.put("G", "--.");
		morseCodeMap.put("H", "....");
		morseCodeMap.put("I", "..");
		morseCodeMap.put("J", ".---");
		morseCodeMap.put("K", "-.-");
		morseCodeMap.put("L", ".-..");
		morseCodeMap.put("M", "--");
		morseCodeMap.put("N", "-.");
		morseCodeMap.put("O", "---");
		morseCodeMap.put("P", ".--.");
		morseCodeMap.put("Q", "--.-");
		morseCodeMap.put("R", ".-.");
		morseCodeMap.put("S", "...");
		morseCodeMap.put("T", "-");
		morseCodeMap.put("U", "..-");
		morseCodeMap.put("V", "...-");
		morseCodeMap.put("W", ".--");
		morseCodeMap.put("X", "-..-");
		morseCodeMap.put("Y", "-.--");
		morseCodeMap.put("Z", "--..");
	}
	
	//encodes message into morse code
	public void generateCode(StringBuffer message) {
		char currentChar;//the current character in message
		String morseCode;//holds the morse code of the character
		StringBuffer stringBuffer = new StringBuffer();//string buffer to concatenate all of the morse code into a single string
		
		//loops through each character in the message
		for(int i = 0; i < message.length(); i++) {
			//gets the character at the current index
			currentChar = message.charAt(i);
			//gets the morse code value of the character form the map
			morseCode = morseCodeMap.get(String.valueOf(currentChar).toUpperCase());
			//builds our encoded message
			stringBuffer.append(morseCode);
		}
		
		//prints the encoded message
		System.out.println(stringBuffer.toString());
	}
}
