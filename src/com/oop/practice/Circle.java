package com.oop.practice;

public class Circle extends Shape {

	private double radius = 0.0;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (3.14 * radius * radius);
	}
}
