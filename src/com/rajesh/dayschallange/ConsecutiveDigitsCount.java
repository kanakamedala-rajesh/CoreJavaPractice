package com.rajesh.dayschallange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConsecutiveDigitsCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		/*
		 * String val = Integer.toBinaryString(n); String[] array; array =
		 * val.split(""); for (String string : array) {
		 * System.out.println(string); } for (int i = 0; i < array.length - 1;
		 * i++) { if (array[i].equals(array[(i + 1)])) { count++; } }
		 * System.out.println("count " + count);
		 */

		int remainder = 0, s = 0, count = 0;

		while (n > 0) {
			remainder = n % 2;
			n = n / 2;
			if (remainder == 1) {
				s++;
				if (s >= count)

					count = s;

			} else {

				s = 0;
			}
		}

		System.out.println(count);
	}
}
