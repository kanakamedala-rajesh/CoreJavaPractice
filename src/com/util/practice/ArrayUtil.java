package com.util.practice;

public class ArrayUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "Amzad", "Arshad", "Afsar", "Basha" };
		print(array);
		Double dArray[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		print(dArray);
		Integer iArray[] = { 100, 200, 300, 400 };
		print(iArray);
		main();
	}

	/**
	 * @param iArray
	 */
	private static <E> void print(E[] iArray) {
		// TODO Auto-generated method stub
		for (E e : iArray) {
			System.out.println(e);
		}
		System.out.println("************");
	}
	
	public static void main(){//method should be static if called from main method
		int i[] = {1,2,3,4,5}; 

		System.out.println("Traditional For Loop"); 
		for (int j=0; j<i.length; j++) { 
		System.out.println(i[j]); 
		} 

		System.out.println("Enhanced For Loop"); 
		for (int j: i) { 
		System.out.println(j); 
		}
	}
}

