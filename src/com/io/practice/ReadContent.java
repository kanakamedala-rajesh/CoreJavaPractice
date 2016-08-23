/**
 * 
 */
package com.io.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Rajesh, Kanakamedala
 */
public class ReadContent {

	public static void main(String[] args) {
		File inputFile = new File("intest.txt");
		try {
			FileReader in = new FileReader(inputFile);
			int c;
			while ((c = in.read()) != -1) {
				System.out.println((char) c);
			}
			in.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
