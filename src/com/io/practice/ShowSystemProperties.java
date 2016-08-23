/**
 * 
 */
package com.io.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ShowSystemProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = System.getProperties();
		p.list(System.out);
		FileOutputStream fos = new FileOutputStream("mysystem.properties");
		p.store(fos, "comments in top");
		fos.close();
	}

}
