package com.rajesh.dayschallange;

import java.io.*;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = in.readLine()) != null) {
			String[] string = s.split(",");
			String[] relations = new String[(string.length - 2)];
			String[] conflitPersons = new String[2];
			for (int i = 0; i < string.length; i++) {
				if (string[i].contains("->")) {
					relations[i] = string[i];
				}
			}
			conflitPersons[0] = string[string.length - 2];
			conflitPersons[1] = string[string.length - 1];

			LinkedHashMap<String, String> map = new LinkedHashMap<>();
			String[] each_element = new String[2];
			each_element = relations[0].split("->");
			map.put(each_element[0], each_element[1]);
			for (int i = 1; i < relations.length; i++) {
				each_element = relations[i].split("->");
				if (map.containsKey(each_element[0])) {
					map.put(each_element[0], each_element[1]);
				}
			}
			System.out.println(map);
		}
	}
}
