
public class TernaryTest {

	static public void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7, b = 8, max , min;
/*
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
	*/
		max = (a > b) ? a : b;
		min = (a < b) ? a : b;
		System.out.println("a: " + a + "\nb: " + b + "\nmax: " + max + "\nmin: " + min);
	}

}
