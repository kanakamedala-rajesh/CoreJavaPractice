/**
 * 
 */
package com.oop.practice;

/**
 * @author Rajesh, Kanakamedala
 */
public class TempObject {

	int temperature;

	TempObject(int temp) {
		temperature = temp;
	}

	public void test() throws TooHot, TooCold {

		if (temperature < 50)
			throw new TooCold("Very Cold");
		if (temperature > 80)
			throw new TooHot("Very Hot");
	}
}
