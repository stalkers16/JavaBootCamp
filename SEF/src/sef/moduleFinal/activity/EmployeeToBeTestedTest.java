package sef.moduleFinal.activity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeToBeTestedTest {



	@Test
	public void testId() {
		EmployeeToBeTested testE = new EmployeeToBeTested();
		testE.setId ("23");
     assert(testE.getId()) == "23";
 }

	@Test
	public void testFirstName() {
		EmployeeToBeTested testE = new EmployeeToBeTested();
		testE.setFirstName ("Janis");
     assert(testE.getFirstName()) == "Janis";
 }
	
	@Test
	public void testLastName() {
		EmployeeToBeTested testE = new EmployeeToBeTested();
		testE.setFirstName ("Zarins");
     assert(testE.getFirstName()) == "Zarins";
 }
	
	@Test
	public void testSalary() {
		EmployeeToBeTested testE = new EmployeeToBeTested();
		testE.setSalary (20000);
     assert(testE.getSalary()) == 20000;
 }


}
