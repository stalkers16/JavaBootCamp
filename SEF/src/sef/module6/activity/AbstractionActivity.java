package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		
		
		//Create an object of Rectangle class with 3 parameters (Main constructor)
				Shape cl= new Rectangle(5, 6);
				Rectangle r1 = new Rectangle(5,6);
				
				cl.setColor("Green");
				
				
				System.out.println("Area of Rectangle is " + cl.calculateArea());
				System.out.println("Perimeter of Square " + cl.calculatePerimeter());
				System.out.println("Color of Rectangle is " + cl.color);
	}

}
