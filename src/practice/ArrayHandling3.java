/**
 * 
 */
package practice;

/**
 * @author Rajesh, Kanakamedala
 */
public class ArrayHandling3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 20, 30, 34, 54, 87, 19, 87, 23, 98, 56 };
		maxElement(array);
		minElement(array);
		int sum = sumOfElements(array);
		averageOfElements(sum, array.length);
	}

	/**
	 * @param array
	 * @return
	 */
	public static int sumOfElements(int[] array) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum of array elements is: " + sum);
		return sum;
	}

	/**
	 * @param sum
	 * @param length
	 */
	public static void averageOfElements(int sum, int length) {
		// TODO Auto-generated method stub
		double average = (sum / length);
		System.out.println("Average of array elements is: " + average);
	}

	/**
	 * @param array
	 */
	public static void minElement(int[] array) {
		// TODO Auto-generated method stub
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min <= array[i]) {
				min = array[i];
			}
		}
		System.out.println("Minimum Element is " + min);
	}

	/**
	 * @param array
	 */
	public static void maxElement(int[] array) {
		// TODO Auto-generated method stub
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max >= array[i]) {
				max = array[i];
			}
		}
		System.out.println("Minimum Element is " + max);
	}

}
