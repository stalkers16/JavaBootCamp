package sef.moduleFinal.activity;
import java.math.*;
import java.util.Scanner;

public class MyCalculator {
	//has written my own two additionally methods 
		public double getPower(double a, double b) {
			System.out.print("Get b power of a ");	
			return Math.pow(a, b));
		}
		
		public double getSqr(double a) {
			System.out.print("Get square root of a ");
			return = Math.sqrt(a);
				
		}
		
		
		public int getSum(int a, int b) {
			System.out.print("Get sum of b a and b ");
			System.out.print(return a + b);
		}
		
		public int getDifference(int a, int b){
			System.out.print("Substract a and b ");
			return a - b;
		}
		
		public double getProduct(double a, double b){
			System.out.print("Get product of a and b");
			return a * b;
		}
		
		public double getQuotient(double a, double b){
			System.out.print("Get quotient of a and b ");
			return a / b;
		}
		
// Inetrface is almost coded, please take a look. It is commented out,
//as I was not able to sort out, why inputted a and b can not be 
//treated as variables to put them as argument in appropriate function
		
		
//		public static void main(String[] args) {
//	    	
//	        Scanner input = new canner(System.in);
//	        
//	        System.out.println("Welcome to MyCalculator!");
//	        System.out.println("************************");
//	        System.out.println("Choose an operation: ");
//	        System.out.println("Sum of two numbers - 1  ");
//	        System.out.println("Difference of two numbers - 2  ");
//	        System.out.println("Product of two numbers - 3  ");
//	        System.out.println("Quotient of two numbers - 4");
//	        System.out.println("Power of two numbers - 5");
//	        System.out.println("Square root of two numbers - 6  ");
//	        	        
//	        int operation = input.nextInt();
//	        //input.close();
//	        
//	        if (operation <=0 || operation > 6) {
//	        	System.out.print("No such operation");	
//	        }
//	        
//	        else if (operation < 3) {
//	        	Scanner input1 = new Scanner(System.in);
//	        	System.out.print("Enter a: ");
//	            int a = input1.nextInt();
//	            //input1.close();
//	            
//	            Scanner input2 = new Scanner(System.in);
//	        	System.out.print("Enter b");
//	            int number1  = input2.nextInt();
//	            //input2.close();
//	        }
//	        else if (operation < 6) {
//	        	Scanner input1 = new Scanner(System.in);
//	        	System.out.print("Enter a: ");
//	            double a = input1.nextDouble();
//	            //input1.close();
//	            
//	            Scanner input2 = new Scanner(System.in);
//	        	System.out.print("Enter b");
//	            double number1  = input2.nextDouble();
//	            //input2.close();	
//	        }
//	        else {
//	        	Scanner input1 = new Scanner(System.in);
//	        	System.out.print("Enter a: ");
//	            double a = input1.nextDouble();
//	            //input1.close();	
//	        }
//	        switch(operation) {
//	        	case 1:
//					getSum(a,b);
//	        		break;
//	        	case 2:
//	        		getDifference(a,b);
//	        		break;
//	        	case 3:
//	        		getProduct(a,b);
//	        		break;
//	        	case 4:
//	        		getQuotient(a,b);
//	        		break;
//	        	case 5:
//	        		getPower(a,b);
//	        		break;
//	        	case 6:
//	        		getSqr(a);
//	        		break;
//	        }
//	    }
	}
