package com.oop.practice;

abstract class A {
	A() {
		System.out.println("A");
		m();
	}

	public abstract void m();
}

class B extends A {
	B() {
		System.out.println("B");
		m();
	}

	private int i = 1;

	public void m() {
		System.out.println(i);
	}
}

public class AB {
	public static void main(String[] args) {
		A obj1 = new B();
	}
}