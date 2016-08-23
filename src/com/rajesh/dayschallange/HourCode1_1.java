/**
 * 
 */
package com.rajesh.dayschallange;

/**
 * @author Rajesh, Kanakamedala
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourCode1_1 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named AbstractClasses.
		 */
		int array_length, op1Cost, op2Cost, average, sum = 0, diff_sum = 0, cost;
		Scanner sc = new Scanner(System.in);
		array_length = sc.nextInt();
		op1Cost = sc.nextInt();
		op2Cost = sc.nextInt();
		int[] values = new int[array_length];
		int[] differance = new int[array_length];
		for (int i = 0; i < values.length; i++) {
			values[i] = sc.nextInt();
		}

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		average = sum / values.length;

		for (int i = 0; i < values.length; i++) {
			differance[i] = Math.subtractExact(values[i], average);
			diff_sum += differance[i];
			values[i] -= differance[i];
		}
		System.out.println(Arrays.toString(differance));
		System.out.println("diff_sum\t" + diff_sum);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
}
