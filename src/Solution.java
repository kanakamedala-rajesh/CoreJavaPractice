import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] array_input = null;
		scanner.nextLine();
		for (int i = 0; i < count; i++) {
			array_input[i] = scanner.nextInt();
		}
		for (int i : array_input) {
			System.out.println(i);
		}
	}
}