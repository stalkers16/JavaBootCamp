package sef.moduleFinal.activity;
import java.util.Scanner;
// primitive interface implemented, my first interactive Java code :)
public class Fibonacci {
			        
	        static int fib(int n) 
	        { 
	            if (n <= 1) 
	                return n; 
	      
	            return fib(n - 1) + fib(n - 2); 
	        } 
	      
	        
	       public static void main(String args[]) {
	        	Scanner input = new Scanner(System.in);
		    	
		        System.out.print("Enter how many Fibonacci numbers you want to display: ");
		        int number = input.nextInt();
		        System.out.println("You entered " + number);
		        System.out.println("Here we go: ");
		        input.close();
		        
	            // Given Number N 
	            int N = number; 
	      
	            // Print the first N numbers 
	            for (int i = 0; i < N; i++) { 
	      
	                System.out.print(fib(i) + " "); 
	            } 
	        } 
	    
}
	
	


