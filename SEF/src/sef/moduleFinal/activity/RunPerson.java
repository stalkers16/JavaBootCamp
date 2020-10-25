package sef.moduleFinal.activity;

import java.util.Arrays;

public class RunPerson {

	public static void main(String[] args) {
				
				//Method of introducing of Person				
				Person pE = new Employee();
				pE.setAge(52);
				pE.setName("Ga1is");
				
				String[] arr =  pE.getName().split("");
				
				for (int i = 0;  i < arr.length; i++) {
					if (arr[i].matches("[a-zA-Z]+")){
						assert true;
					}else {
						//there must be a thrown Custom Exception instead !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						System.out.println("Name is spelled NOT correctly	");
						break;
					}
							
				}
				
				System.out.println("---------------------------");
				System.out.printf("My Name is %s and I am %s years old \n", pE.getName(), pE.getAge()) ;				
				
	 		
				//Here we  do a broader introducing of Emplyee
				Employee e = new Employee();
				pE.setAge(33);
 				pE.setName("Janis");
				e.setcompany("Accenture");
				e.settitle("QA Engineer");
				
				System.out.println("---------------------------");
				System.out.printf("My Name is %s and I am %s years old \n", pE.getName(), pE.getAge()) ;
				System.out.printf("I am working at %s and I am %s \n", e.getcompany(), e.gettitle()) ;
				
			}

}

