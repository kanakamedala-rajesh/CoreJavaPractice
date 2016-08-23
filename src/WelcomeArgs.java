
public class WelcomeArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World! Welcome to Java Programming");
		if (args.length > 0) {
			System.out.println("Argument 0: " + args[0]);
			System.out.println("Argument 1: " + args[1]);
			System.out.println("Argument 2: " + args[2]);
		}
		else{
			System.out.println("No Program arguments Passed");
		}
	}
}
