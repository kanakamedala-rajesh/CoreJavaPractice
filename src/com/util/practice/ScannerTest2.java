package com.util.practice;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter EmpNo: ");
		int sno = readInt();
		System.out.println("Enter Name: ");
		String name = readString();
		System.out.println("No: " + sno);
		System.out.println("Name: " + name);

	}

	/**
	 * @return
	 */
	private static String readString() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}

	/**
	 * @return
	 */
	private static int readInt() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}

}
