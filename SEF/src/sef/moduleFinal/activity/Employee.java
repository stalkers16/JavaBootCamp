package sef.moduleFinal.activity;
import sef.moduleFinal.activity.Person;
/* Employee class is the sub class of Person class
 * Attributes : company, title
 */
public class Employee extends Person{

	//Attributes
	private String title;
	private String company;
	
	//Behavior - default constructor
	public Employee(){ 
		 
	}
	
	// getter for String title
	public String gettitle() {
		return title;
	}
	
	// setter for string title
	public void settitle(String title) {
		this.title = title;
	}
	
	// getter for String company
	public String getcompany() {
		return company;
	}
	
	// setter for String company
	public void setcompany(String company) {
		this.company = company;
	}
	

		
}
