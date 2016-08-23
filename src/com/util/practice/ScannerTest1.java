package com.util.practice;

import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First No: ");
		int a = scanner.nextInt();
		System.out.println("Enter Second No: ");
		int b = scanner.nextInt();
		int sum = a + b;
		System.out.println("Sum of  " + a + " and " + b + ": " + sum);
		scanner.close();

	}

}
