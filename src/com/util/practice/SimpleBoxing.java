package com.util.practice;

public class SimpleBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n1 = new Integer(43);
		int i1 = n1; // unboxing
		int i2 = 57;
		Integer n2 = i2; // boxing
		System.out.println(n1 + " " + n2 + " " + i1 + " " + i2);

		printArray(new int[] { 1, 2, 3, 4 });
	}

	/**
	 * @param is
	 */
	private static void printArray(int[] is) {
		// TODO Auto-generated method stub
		for (Integer num : is) {
			System.out.println(num);
		}
	}
	

}
