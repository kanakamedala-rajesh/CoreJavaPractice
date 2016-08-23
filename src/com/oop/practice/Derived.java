package com.oop.practice;

class Derived extends Base {

	Derived(int a, int b) {
		super(a);
		System.out.println("a: " + a + " b : " + b);
		// super(a);
	}

	void print() {
		System.out.println("Derived");
		super.print();
	}

	public static void main(String[] args) {
		Base b = new Derived(10, 20);
		b.print();

	}
}
