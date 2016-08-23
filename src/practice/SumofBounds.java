/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Rajesh
 *
 */
public class SumofBounds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min_val, max_val;
		int sum = 0;
		System.out.print("Enter Lower Bound: ");
		Scanner sc = new Scanner(System.in);
		min_val = sc.nextInt();
		System.out.print("Enter Upper Bound: ");
		max_val = sc.nextInt();
		for (int i = min_val; i <= max_val; i++) {
			sum += i;
			if (i == max_val)
				System.out.println(i + " = " + sum);
			else
				System.out.print(i + "+");
		}
		System.out.println("Sum of Upperbound to Lowerbound is: " + sum);

	}

}
