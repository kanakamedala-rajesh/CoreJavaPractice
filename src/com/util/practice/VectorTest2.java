package com.util.practice;

import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector<>();
		v.add("Rajesh");
		v.add("Prasanna");
		v.add("Vamsee");
		v.add("Rohith");
		v.add("Bhavana");
		v.add("Rajesh");

		if (v.contains("Rajesh")) {
			System.out.println("Rajesh");
		}
		System.out.println(v.lastIndexOf("Rajesh"));
	}

}
