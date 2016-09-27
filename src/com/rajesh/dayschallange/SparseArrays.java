/**
 * 
 */
package com.rajesh.dayschallange;

import java.util.Scanner;

public class SparseArrays {

	public static Scanner scanner;

	public static void main(String[] args) {
		System.out.println("enter time:");
		scanner = new Scanner(System.in);
		String time = scanner.nextLine();
		String[] values = time.split(":");
		if (values[2].contains("PM")) {
			values[2].replace("P", "Q");
			System.out.println("dome");
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println("i: " + i + " value: " + values[i]);
		}
	}
}
