package com.rajesh.dayschallange;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();
		double total = 0.0;
		// System.out.println(tipPercent+" "+taxPercent);

		// Write your calculation code here.
		double tip_cost = (mealCost * tipPercent) / 100;
		// System.out.println(tip_cost);
		double tax_cost = (mealCost * taxPercent) / 100;
		// System.out.println(tax_cost);
		total = mealCost + tip_cost + tax_cost;
		// System.out.println(total);
		// cast the result of the rounding operation to an int and save it as
		// totalCost
		int totalCost = (int) Math.round(total);

		// Print your result
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}

}
