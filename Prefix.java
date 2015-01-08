/*
 * File: Prefix.java
 * ---------------------
 * Returns an array with all the strings that begin with the given prefix within another
 * given array.
 */

import acm.program.*;
import java.util.*;
public class Prefix extends ConsoleProgram{
	
	public void run() {
		String[] array = {"602F4fko","602LMJoX","602oIAbV",
						"582YtqYy","582eZIr7","160HeNak"};
		println("These are the elements of the array:");
		
		for (int i = 0; i < array.length; i++) {
			println(array[i]);
		}
		
		String prefix = readLine("Enter the desired prefix: ");
		String[] arrayOfNonPrefixes = getArrayOfNonPrefixes(array, prefix);
		
		println("These are the strings not including the prefix: ");
		for (int i = 0; i < arrayOfNonPrefixes.length; i++) {
			println(arrayOfNonPrefixes[i]);
		}
	}
	
	private String[] getArrayOfNonPrefixes(String[] array, String prefix) {
		int numChar = prefix.length();
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < array.length; i++) {
			if (array[i].substring(0,numChar + 1).equals(prefix))
				list.add(array[i]);
		}
		
		String[] result = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
