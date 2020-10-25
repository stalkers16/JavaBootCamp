package sef.moduleFinal.activity;

public class TryCatchFinally {

	public static void main(String[] args) {
		int[] arr = new int[5]; 
	        try
	        { 
	            int i = arr[5]; 
	                  
	            // this statement will never be executed 
	            // as exception is raised by above statement 
	            System.out.println("Inside try block"); 
	        } 
	        catch(ArrayIndexOutOfBoundsException ex) 
	        { 
	            System.out.println("Exception caught in Catch block"); 
	        } 
	        
	        finally
	        {
	        // rest program will be executed 
	        System.out.println("Finally is executed outside try-catch block"); 
	        }
      } 
        

}


