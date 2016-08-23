package com.oop.practice;

class Base {
	Base() {
		System.out.println("No arg constructor");
	}

	Base(int a) {
		System.out.println(a);
	}
	// Overloaded constructor

	void print() {
		System.out.println("Base");
	}
}