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
public class ReadLines {

	public static void main(String[] args) {

		File inputFile = new File("outtest.txt");
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(inputFile);
			DataInputStream dataStream = new DataInputStream(inputStream);
			try {
				while (dataStream.available() != 0) {
					String data = dataStream.readLine();
					System.out.println(data);
				}
				dataStream.close();
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
