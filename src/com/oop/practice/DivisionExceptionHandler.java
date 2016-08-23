/**
 * 
 */
package com.oop.practice;

/**
 * @author Rajesh, Kanakamedala
 */
public class DivisionExceptionHandler {

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
		System.out.println("Computing Division.");
		int average = 0;
		try {
			average = i / j;
			System.out.println("Average : " + average);
		} catch (Exception ae) {
			System.out.println("Exception: " + ae.toString());
		} finally {
			if (average == 0) {
				System.out.println("Finally executed after exception");
			} else {
				System.out.println("finally block without excetion");
			}

		}
	}

}
