/**
 * 
 */
package com.oop.practice;

/**
 * @author Rajesh, Kanakamedala
 */
public class DivisionException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Begin");
		division(100, 4); // Line 1
		division(100, 0); // Line 2
		System.out.println("End");
	}

	/**
	 * @param i
	 * @param j
	 */
	public static void division(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("Computing Division.");
		int average = i / j;
		
		System.out.println("Average : " + average);
	}

}
