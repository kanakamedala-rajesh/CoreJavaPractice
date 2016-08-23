package com.rajesh.dayschallange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypesExample {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
		int i2;
		double d2;
		String s2;

		/* Read and save an integer, double, and String to your variables. */

		i2 = scan.nextInt();
		d2 = scan.nextDouble();
		scan.nextLine();
		s2 = scan.nextLine();

		int integer_sum = i + i2;
		double double_sum = d + d2;
		double roundOff = Math.round(double_sum * 10.0) / 10.0;

		/* Print the sum of both integer variables on a new line. */
		System.out.println(integer_sum);

		/* Print the sum of the double variables on a new line. */
		System.out.println(roundOff);
		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		System.out.println(s + s2);
		scan.close();
	}
}