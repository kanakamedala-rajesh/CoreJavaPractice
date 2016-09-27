package com.rajesh.dayschallange;

import java.io.*;
import java.util.regex.*;

public class exam1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = in.readLine()) != null) {
			String temp[] = s.split(" ");
			int N = Integer.parseInt(temp[0]);
			int p = Integer.parseInt(temp[1]);
			int q = Integer.parseInt(temp[2]);
			for (int i = 1; i <= N; i++) {
				if (i % p == 0 || i % q == 0) {
					if (String.valueOf(i).contains(temp[1]) || String.valueOf(i).contains(temp[2]) || i == p
							|| i == q) {
						if (i != N)
							System.out.print("OUTTHINK,");
						else
							System.out.println("OUTTHINK");
					} else if (i != N)
						System.out.print("OUT,");
					else
						System.out.println("OUT");
				} else if (String.valueOf(i).contains(temp[1]) || String.valueOf(i).contains(temp[2])) {
					if (i != N)
						System.out.print("THINK,");
					else
						System.out.println("THINK");
				} else {
					if (i != N)
						System.out.print(i + ",");
					else
						System.out.println(i);
				}
			}
		}
	}
}
