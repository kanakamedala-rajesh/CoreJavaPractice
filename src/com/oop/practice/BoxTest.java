package com.oop.practice;

public class BoxTest {

	public static void main(String[] args) {

		Box b1 = new Box(10,20,30);
//		b1.setLength(20);
//		b1.setWidth(30);
//		b1.setHeight(10);
		


		System.out.println("Length: " + b1.getLength());
		System.out.println("Width: " + b1.getWidth());
		System.out.println("Heigth: " + b1.getHeight());
		System.out.println("Volume: " + b1.getVolume());
	}

}
