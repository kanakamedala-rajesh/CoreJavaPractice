package com.util.practice;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateDifferanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** The date at the end of the last century */
		Date d1 = new GregorianCalendar(1992, 03, 05, 23, 59).getTime();
		/** Today's date */
		Date today = new Date();

		// Get msec from each, and subtract.
		long diff = today.getTime() - d1.getTime();
		System.out.println("The 21st century (up to " + today + ") is " + (diff / (1000 * 60 * 60 * 24)) + " days old.");
	}

}
