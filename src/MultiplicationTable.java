
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			int num = Integer.parseInt(args[0]);

			for (int i = 1; i <= 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
			System.out.println("------------");
			for (int i = 10; i >= 1; i--) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
		} else {
			System.out.println("No Program arguments Passed");
		}

	}

}
