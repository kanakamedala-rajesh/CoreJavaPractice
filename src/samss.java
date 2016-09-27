import java.util.Scanner;

public class samss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    for(int i= 0; i<num; i++){
	            for(int j = 0; j< num - i -1; j++){
	            System.out.print(" ");
	            }
	            for(int k = 0; k<=i; k++)
	                System.out.print("#");
	            System.out.println("");
	        }
	}

}
