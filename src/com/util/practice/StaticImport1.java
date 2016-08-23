package com.util.practice;

import static java.lang.System.out;
import static java.lang.Math.PI; 

public class StaticImport1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println("import static");
		out.println("Hello World!");
		double radius = 3.0;
		double area = PI * radius * radius;
		out.println("Area of the circle whose radius: " + radius + " is: " + area);
	}

}
