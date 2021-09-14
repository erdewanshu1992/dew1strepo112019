package chapter1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Personal_loan {
	@Test  
	 public void personal_loan()  
	 {  
	     System.out.println("Personal Loan");  
	 }  
	 @BeforeSuite  
	 public void before_suite()  
	 {  
	     System.out.println("First method");  
	 }  

}
