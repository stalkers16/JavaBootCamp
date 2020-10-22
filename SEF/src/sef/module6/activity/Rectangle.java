package sef.module6.activity;

public class Rectangle extends Shape {
	
	private double length;
	private double breadth;
	
	Rectangle() {	
		
	}
	
	public Rectangle(double length, double breadth) {  
	//super.color = col;
	this.length = length;
	this.breadth = breadth;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public  double getLength() {
		return length;
	}
	
	public void setBreadth(double breadth) {
		this.length = breadth;
	}
	public double getBreath() {
		return breadth;
	}
	
	

	@Override
	public double calculateArea() {
		//double area;
		double area = (length * breadth);
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter;
		perimeter = 2 * (length + breadth); 
		return perimeter;
	}
}
