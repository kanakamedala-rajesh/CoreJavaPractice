/**
 * 
 */
package practice;

/**
 * @author Rajesh
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("*\t|\t");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i+"\t");
		}
		System.out.println("");
		for (int i = 0; i <=12; i++) {
			System.out.print("-\t");
		}
		System.out.println("");
//		System.out.println("-------------------------------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			System.out.print("\t| ");
			
			for (int j = 0; j <= 10; j++) {
				int mul = i*j;
				System.out.print("\t" + mul);
			}
			System.out.println("");
		}

	}

}
