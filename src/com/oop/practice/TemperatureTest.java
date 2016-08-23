/**
 * 
 */
package com.oop.practice;

/**
 * @author Rajesh, Kanakamedala
 */
public class TemperatureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		temperatureReport(new TempObject(100));
		temperatureReport(new TempObject(25));
		temperatureReport(new TempObject(60));
		
	}

	/**
	 * @param tempObject
	 */
	private static void temperatureReport(TempObject tempObject) {
		// TODO Auto-generated method stub
		try {
			tempObject.test();
			System.out.println(tempObject.temperature + " - Perfect Temperature");
		} catch (TooHot e) {
			// TODO Auto-generated catch block
			System.out.println(tempObject.temperature + " - " + e.getMessage());
		} catch (TooCold e) {
			// TODO Auto-generated catch block
			System.out.println(tempObject.temperature + " - " + e.getMessage());
		}
	}

}
