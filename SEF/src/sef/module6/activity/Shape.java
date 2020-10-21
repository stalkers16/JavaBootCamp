package sef.module6.activity;

public abstract class Shape {

	public static String color;
	
	public Shape(String color) {
		Shape.color = color;
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();

	public void setColor(String c) {
		Shape.color = c;
	}
	public static String getColor() {
		return color;
	}
	

	
}
