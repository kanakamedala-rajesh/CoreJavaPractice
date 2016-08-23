package com.util.practice;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();
		v.addElement("Arshad");
		v.addElement("Afsar");
		v.addElement("Aleefia");
		v.addElement("Aneesa");
		v.addElement("Aaqib");

		System.out.println(v);

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String element = (String) e.nextElement();
			System.out.println(element);
		}

		System.out.println("-----------");

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

}
