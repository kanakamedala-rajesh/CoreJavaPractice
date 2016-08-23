/**
 * 
 */
package practice;

/**
 * @author Rajesh
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1, num2 = 1;
		int sum = 0;
		int sum2 = num1 + num2;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int i = 0; i < 18; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			sum2 += num2;
			System.out.print(sum + " ");
		}
		System.out.println("The Average is: " + sum2);

	}

}
