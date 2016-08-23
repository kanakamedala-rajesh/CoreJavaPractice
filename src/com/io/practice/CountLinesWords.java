/**
 * 
 */
package com.io.practice;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Rajesh, Kanakamedala
 */
public class CountLinesWords {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inputFile = new File("myfile.txt");
		FileInputStream fin = new FileInputStream(inputFile);
		DataInputStream in = new DataInputStream(fin);
		String data;
		int lineCounter = 0;
		int wordCounter = 0;

		System.out.println("Content in the file " + inputFile.getName() + " is as follows:");
		System.out.println("---------------------------------------------------------------");

		while (in.available() != 0) {
			data = in.readLine();
			System.out.println(data);
			String[] words = data.split(" ");
			wordCounter += words.length;
			lineCounter++;
		}
		System.out.println();
		System.out.println("No. of lines in the file: " + lineCounter);
		System.out.println("No. of words in the file: " + wordCounter);

		in.close();
	}

}
