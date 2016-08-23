
public class BiggestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			if (a > b) {
				System.out.println(a + " is greater than " + b);
			} else {
				System.out.println(b + " is greater than " + a);
			}
		} else {
			System.out.println("No values to compare!!");
		}
	}

}
