/**
 * 
 */
package com.util.practice;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> m = new TreeMap<String, String>();
		m.put("Amzad", "Trainer");
		m.put("Abhi", "Engineer");
		m.put("Sushmitha", "Student");
		m.put("Sateesh", "Professor");
		m.put("Hema", "Doctor");
		System.out.println(m.get("Amzad"));

		Iterator<String> iterator = m.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next(); //gets key values into key variable by next()
			System.out.println(key + "=" + m.get(key));
		}
	}

}
