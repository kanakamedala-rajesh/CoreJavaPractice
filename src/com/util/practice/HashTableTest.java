package com.util.practice;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Amzad");
		ht.put(102, "Abhi");
		ht.put(103, "Hema");
		ht.put(104, "Sateesh");
		ht.put(105, "Sushmitha");

		System.out.println(ht);

		Enumeration<Integer> e = ht.keys();
		while (e.hasMoreElements()) {
			Integer key = (Integer) e.nextElement();
			System.out.println(key + "=" + ht.get(key));
		}

	}

}
