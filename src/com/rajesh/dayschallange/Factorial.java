package com.rajesh.dayschallange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named AbstractClasses.
		 */
		int num, fact = 1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		/*
		 * for (int i = num; i >= 1; i--) { fact *= i; }
		 * System.out.println(fact);
		 */

		fact = factorial(num);
		System.out.println(fact);
	}

	/**
	 * @param num
	 * @return
	 */
	private static int factorial(int num) {
		// TODO Auto-generated method stub
		int fact = 1;
		if (num >= 1)
			fact = num * factorial((num - 1));
		else
			fact = fact * 1;
		return fact;
	}
}