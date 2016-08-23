package com.oop.practice;

public class C implements I, J {

	public static void main(String[] args) {
		int i = 10, j = 7;
		C obj = new C();
		System.out.println("Sum of " + i + " and " + j + " is: " + obj.add(i, j));
		System.out.println("Difference of " + i + " and " + j + " is: " + obj.subtract(i, j));

		boolean test = obj.isDivisible(i, j);
		if (test == true) {
			System.out.println(i + " is divisible by " + j);
		} else {
			System.out.println(i + " is not divisible by " + j);
		}
	}

	@Override
	public boolean isDivisible(int x, int y) {
		// TODO Auto-generated method stub
		return (x % y == 0);
	}

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return (i + j);
	}

	@Override
	public int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return (i - j);
	}

}
