package sef.module6.activity;

public class AbstractionActivity extends Rectangle {

	public static void main(String[] args) {
		
		//sh.setColor("green");
		
		Rectangle rt = new Rectangle();
		rt.setLength(10);
		rt.setBreadth(4);
		
		
		
		System.out.println("Area of rectangle = " + rt.calculateArea());
		System.out.println("Perimeter of rectangle = " + rt.calculatePerimeter());
	//	System.out.println("Perimeter of rectangle = " + getColor());
	}

}
