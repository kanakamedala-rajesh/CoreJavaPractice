/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Rajesh
 *
 */
public class PrintNumNestedIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num >= 0) {
			switch (num) {
			case 0:
				System.out.println("ZERO using Switch Case");
				break;
			case 1:
				System.out.println("ONE using Switch Case");
				break;
			case 2:
				System.out.println("TWO using Switch Case");
				break;
			case 3:
				System.out.println("THREE using Switch Case");
				break;
			case 4:
				System.out.println("FOUR using Switch Case");
				break;
			case 5:
				System.out.println("FIVE using Switch Case");
				break;
			case 6:
				System.out.println("SIX using Switch Case");
				break;
			case 7:
				System.out.println("SEVEN using Switch Case");
				break;
			case 8:
				System.out.println("EIGHT using Switch Case");
				break;
			case 9:
				System.out.println("NINE using Switch Case");
				break;
			default:
				System.out.println("OTHER using Switch Case");
			}
		} else {
			System.out.println("No values to print!! using Switch Case");
		}
		
		
		//ifElse Starts
		
		
		if (num >= 0) {
			if(num == 1)
				System.out.println("ONE using ifElse");
			else if (num == 2) 
				System.out.println("TWO using ifElse");
			else if(num == 3)
				System.out.println("Three using ifElse");
			else if(num == 4)
				System.out.println("FOUR using ifElse");
			else if(num ==5 )
				System.out.println("FIVE using ifElse");
			else if(num ==6)
				System.out.println("SIX using ifElse");
			else if(num ==7)
				System.out.println("SEVEN using ifElse");
			else if(num ==8)
				System.out.println("EIGHT using ifElse");
			else if(num ==9)
				System.out.println("NINE using ifElse");
			else if(num ==0)
				System.out.println("ZERO using ifElse");
			else 
				System.out.println("OTHER using ifElse");
		} else {
			System.out.println("No values to print!! using ifElse");
		}
		
		

	}

}
