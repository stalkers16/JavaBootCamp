package sef.module6.activity;

public class Rectangle extends Shape {
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		super(color);
		this.length = 0;
		this.breadth = 0;
	}
	
//	public Rectangle(length, breadth) { // why it is treated as duplicate of general constructor??? 
//	this.length = length;
//	this.breadth = breadth;
//	}

	public void setLength(int length) {
		this.length = length;
	}
	public  int getLength() {
		return length;
	}
	
	public void setBreadth(int breadth) {
		this.length = breadth;
	}
	public int getBreath() {
		return breadth;
	}
	
	

	@Override
	public double calculateArea() {
		int area;
		area = (length * breadth);
		return area;
	}

	@Override
	public double calculatePerimeter() {
		int perimeter;
		perimeter = 2 * (length + breadth); 
		return perimeter;
	}
}
