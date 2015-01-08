/*
 * File: ReverseString.java
 * ---------------------
 * Reverse the string inputed by the user
 */

import acm.program.*;

public class ReverseString extends ConsoleProgram {
	public void run() {
		String word = readLine("Enter the string you want reversed: ");
		println("Here is the reversed string: " + reverseString(word));
	}
	
	private String reverseString(String word) {
		String result = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);
		}
		
		return result;
	}
}

