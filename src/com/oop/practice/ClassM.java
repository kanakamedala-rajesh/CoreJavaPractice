package com.oop.practice;

public class ClassM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassM obj = new ClassM();
		obj.amethod(args);

	}

	private void amethod(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
