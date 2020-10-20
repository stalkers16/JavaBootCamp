/**
 * 
 */
package sef.module3.activity;


/**
 * @author 
 *
 */
public class Calculator {
		
	public static void main(String[] args) {
		
	int x = 2;
	int y = 5;
	int[] nums = {1, 2, 3, 4};
	
	System.out.println("Addition - " + add(x,y));
	System.out.println("Subtraction - " + subtract(x,y));
	System.out.println("Multiply - " + multiply(nums));
	System.out.println("Divide - " + divide(x,y));
	
	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	
	private static int subtract(int x, int y) {
		int diff = 0;
		if (x < 0) {
			diff = x-y;
		}else {
			diff = y-x;	
		}

		return diff;
	}
//
	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}
	

	private static float divide(int x, float y) {
		float divValue = 0;
		if (y == 0) {
			System.out.println("Error! Dividing with zero is not allowed");
			
		} else {
			divValue = x / (float)y;
			
		}
		return divValue;

	}
	
}

