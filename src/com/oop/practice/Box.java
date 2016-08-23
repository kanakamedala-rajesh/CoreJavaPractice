package com.oop.practice;

public class Box {

	// the properties or fields
	int length;
	private int width;
	private int height;

	public Box() {
		// default box is point
		length = 0;
		width = 0;
		height = 0;
	}

	public Box(int l, int w, int h) {
		// allows giving initial size
		length = l;
		width = w;
		height = h;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getVolume() {
		return (length * width * height);
	}

}
