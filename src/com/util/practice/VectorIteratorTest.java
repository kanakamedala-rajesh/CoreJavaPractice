package com.util.practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorIteratorTest {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();
		v.addElement("Arshad");
		v.addElement("Afsar");
		v.addElement("Aleefia");
		v.addElement("Aneesa");
		v.addElement("Aaqib");

		System.out.println(v);
		System.out.println("Before while, Vector size: " + v.size());

		Iterator<String> e1 = v.iterator();
		while (e1.hasNext()) {
			String element = (String) e1.next();
			System.out.println(element);
			e1.remove();
		}
		System.out.println("After while, Vector size: " + v.size());

		System.out.println("-----------");

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		Iterator<String> iterator = new Iterator<String>() {
			
			@Override
			public String next() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
