package sef.moduleFinal.activity;

public class Person {

	//Attributes
	private String name;
	private int age;
	
	//Behavior - default constructor
	public Person(){
		this.name="Unknown";
		this.age = 0;		
	}
	
	//Behavior - parameterized constructor
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// getter for String name
	public String getName() {
		return name;
	}
	
	// setter for String name
	public void setName(String name) {
		this.name = name;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}	
}
