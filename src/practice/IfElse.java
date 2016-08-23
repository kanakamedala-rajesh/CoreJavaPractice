/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Rajesh
 *
 */
public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark;
		System.out.print("Enter Maks: ");
		Scanner sc = new Scanner(System.in);
		mark = sc.nextInt();
		if(mark>=50){
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}

}
