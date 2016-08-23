package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringEvenOdd {

	@SuppressWarnings({ "null", "resource" })
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named AbstractClasses.
		 */
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		System.out.println(t);
		for (int i = 0; i < t; i++) {
			String word = sc.nextLine();
			String[] alph = word.split("");
			for (int k = 0; k < word.length(); k++) {
				int j = 0;
				String[] even = null;
				String[] odd = null;
				if (k % 2 == 0) {
					even[j] = alph[k];
					j++;
				} else {
					odd[j] = alph[k];
					j++;
				}
				for (String evenNum : even) {
					System.out.print(evenNum);
				}
				for (String oddNum : odd) {
					System.out.print(oddNum);
				}
			}

		}
	}

}
