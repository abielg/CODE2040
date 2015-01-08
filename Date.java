/*
 * File: Data.java
 * ---------------------
 * Prints out the number of days, hours, minutes, and seconds that are within a given interval of seconds.
 * These numbers are then inputed to an online calculator to find the date.
 */

import acm.program.*;

public class Date extends ConsoleProgram {
	/* DISCLAIMER: I didn't have time to research any date libraries for java
	 * that would have enabled me to manipulate the ISO 8601 datestamp that
	 * was given to me (it's January 7, 11:59 PM). I therefore took the seconds interval and found the
	 * days, hours, minutes, and seconds within it (you can see the numbers
	 * in the console if you run the program). I then used this website:
	 * http://www.csgnetwork.com/juliandaydate.html?DaysDiff=++743
	 * to calculate the date if I added the number of days, hours, minutes, and
	 * seconds to get the correct datestamp. I typed the date from the calculator
	 * in ISO 8601 format and sent it to the server, and saw that it was correct.
	 */
	public void run(){
		int interval = 64204600;
		int seconds = interval % 60;
		int minutes = (interval / 60) % 60;
		int hours = ((interval / 60) / 60) % 24;
		int days = (((interval / 60) / 60)) / 24;
		println(days + " days " + hours  + " hours " + minutes + " minutes " + seconds + " seconds.");
	}

}
