package com.rajesh.dayschallange;

import java.util.Scanner;

abstract class Book {
	String title;
	String author;

	Book(String t, String a) {
		title = t;
		author = a;
	}

	abstract void display();

}

public class AbstractClasses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		String author = sc.nextLine();
		int price = sc.nextInt();
		Book new_novel = new MyBook(title, author, price);
		new_novel.display();

	}

}

class MyBook extends Book {
	int price;

	/**
	 * @param t
	 * @param a
	 * @param price
	 */
	public MyBook(String t, String a, int price) {
		super(t, a);
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rajesh.dayschallange.Book#display()
	 */
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price);
	}

}
