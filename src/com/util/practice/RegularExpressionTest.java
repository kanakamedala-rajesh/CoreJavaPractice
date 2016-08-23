package com.util.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 2) {
			System.out.println("Please pass minimum two args: " + "characterSequence regularExpression+");
			System.exit(0);
		}

		System.out.println("Input: \"" + args[0] + "\"");

		for (int i = 1; i < args.length; i++) {
			System.out.println("Regular expression: \"" + args[i] + "\"");

			Pattern p = Pattern.compile(args[i]);
			Matcher m = p.matcher(args[0]);
			while (m.find()) {
				System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
			}
		}
	}

}
