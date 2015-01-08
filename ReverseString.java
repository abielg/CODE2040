/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
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

