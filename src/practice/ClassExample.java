/**
 * 
 */
package practice;

/**
 * @author Rajesh
 *
 */
public class ClassExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		b.walk();
		b.fly();
		b.sing();

	}

}

class Animal {
	public void walk() {
		System.out.println("I am Walking");
	}
}

class Bird extends Animal {
	public void fly() {
		System.out.println("I am Flying");
	}

	public void sing() {
		System.out.println("I am singing");
	}
}
