/**
 * 
 */
package practice;

import java.util.Scanner;

/**
 * @author Rajesh, Kanakamedala
 */
public class ArrayHandling1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array_list = { "Hi", "Welcome", "to", "Java", "training", "In", "this", "we", "learn", "Java" };
		System.out.println("Enter search string");
		Scanner sc = new Scanner(System.in);
		String searchString = sc.nextLine();
		search(array_list, searchString);
	}

	/**
	 * @param array_list
	 * @param searchString
	 */
	public static void search(String[] array_list, String searchString) {
		// TODO Auto-generated method stub
		int status = -1;
		for (int i = 0; i < array_list.length; i++) {
			// equalsIgnoreCase replaced with equals if case Sensitive
			if (array_list[i].equalsIgnoreCase(searchString)) {
				status = i;
			}
		}
		if (status >= 0) {
			System.out.println("Strign '" + searchString + "' found at position " + (status + 1));
		} else {
			System.out.println("Sorry string not found");
		}
	}

}
