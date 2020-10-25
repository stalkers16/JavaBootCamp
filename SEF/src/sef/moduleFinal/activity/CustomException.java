package sef.moduleFinal.activity;

public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//1 - Override the toString method of Exception.
	//This message gets printed as soon as CustomException is thrown.
	public String toString() {
		return "The Name is spelled wrong";
	}
		
}


