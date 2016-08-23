package com.oop.practice;

public class ShapesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();

		rectangle.setHeight(10);
		rectangle.setWidth(12);
		System.out.println("Rectangle height: " + rectangle.getHeight());
		System.out.println("Rectangle width: " + rectangle.getWidth());
		System.out.println("Rectangle area: " + rectangle.getArea());

		circle.setRadius(5);
		System.out.println("Circle radius: " + circle.getRadius());
		System.out.println("Circle area: " + circle.getArea());
		
		
	}

}
