/**
 * 
 */
package practice;

import java.util.Random;

/**
 * @author Rajesh
 *
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random var_random = new Random();
		char grade = 0;
		int num = var_random.nextInt(100) + 1;
		if (num > 90) {
			grade = 'A';
		} else if (num >= 75 && num <= 89) {
			grade = 'B';
		} else if (num >= 60 && num <= 74) {
			grade = 'C';
		} else if (num < 60) {
			grade = 'D';
		}

		switch (grade) {
		case 'A':
			System.out.println("Random Number is: " + num + " and grade is: A");
			break;
		case 'B':
			System.out.println("Random Number is: " + num + " and grade is: B");
			break;
		case 'C':
			System.out.println("Random Number is: " + num + " and grade is: C");
			break;
		case 'D':
			System.out.println("Random Number is: " + num + " and grade is: D");
			break;
		default:
			System.out.println("Random Number is: " + num + " Error occured!! invalid Number");
			break;
		}
	}

}
