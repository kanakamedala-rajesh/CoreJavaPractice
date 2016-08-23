package com.oop.practice;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticTest st1 = new StaticTest();
		st1.print(1);
		StaticTest st2 = new StaticTest();
		st2.print(2);
	}

	static {
		System.out.println("Hi");
	}

	public void print(int i) {
		System.out.println("Hello" + i);
	}

}
