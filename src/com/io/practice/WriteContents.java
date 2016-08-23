/**
 * 
 */
package com.io.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Rajesh, Kanakamedala
 */
public class WriteContents {

	public static void main(String[] args) {
		File outFile = new File("outtest.txt");
		try {
			FileWriter writer = new FileWriter(outFile, true);
			writer.write("Sample content\n");
			writer.write("Ateef\n");
			writer.write("Sravan\n");
			writer.write("Sham\n");
			writer.write("Rajesh");
			writer.close();
			System.out.println("Data is written into " + outFile.getName() + " successfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
