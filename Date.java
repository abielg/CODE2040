/*
 * File: Data.java
 * ---------------------
 * Adds the seconds interval to the given ISO 8601 datestamp, forms a new
 * stamp, and returns it.
 */

import acm.program.*;

public class Date extends ConsoleProgram {
	
	public void run(){
		int interval = 64204600;
		int seconds = interval % 60;
		int minutes = (interval / 60) % 60;
		int hours = ((interval / 60) / 60) % 24;
		int days = (((interval / 60) / 60)) / 24;
		
		/*
		int minutesTemporary = interval / 60;
		
		int minutes = minutesTemporary % 60;
		int hoursTemporary = minutesTemporary / 60;
		int hours = hoursTemporary % 24;
		int daysTemporary = hoursTemporary / 24;
		int days = daysTemporary % 24;
		*/
		println(days + " days " + hours  + " hours " + minutes + " minutes " + seconds + " seconds.");
		
	}

}
