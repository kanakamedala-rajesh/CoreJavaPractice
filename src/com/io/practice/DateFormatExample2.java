/**
 * 
 */
package com.io.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make a String that has a date in it,
		// with MEDIUM date format
		// and SHORT time format.
		String dateString = "Nov 23, 1976 5:14 PM";
		// Get the default MEDIUM/SHORT DateFormat
		DateFormat format = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT);
		try {
			Date date = format.parse(dateString);
			System.out.println("Original string: " + dateString);
			System.out.println("Parsed date    : " + date.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
