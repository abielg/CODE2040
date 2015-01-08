/*
 * File: NeedleHaysack.java
 * ---------------------
 * Indicates the index in which a certain element was located in an array
 */

import acm.program.*;
public class NeedleHaysack extends ConsoleProgram {
	
	public void run() {
		String needle = readLine("Enter needle: ");
		String[] haystack = {"CsL7W","F5gXp","RShbj","rl4uj","rG0kb","iC7EQ","eyGik",
		                     "MlJQu","HfkQb","bsK9x","0CrXg","QwXJL","hr7eU","4ytwM",
		                     "zfyrH","TRsbq","VJr1c","e14WO","njqMl","o2FwM"};
		println(getNeedleIndex(needle, haystack));
	}
	
	private int getNeedleIndex(String needle, String[] haystack) {
		int index = -1;
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i].equals(needle))
				index = i;
		}
		return index;
	}

}
