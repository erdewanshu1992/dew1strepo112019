package inetBankingV1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng {
	@RunWith(Parameterized.class)
	public class Junttest {
	public String name;
	public int age;
	public Junttest(String name,int age){
	this.name=name;
	this.age=age;
	}
	 
	@Test
	public void testMethod(){
	System.out.println("Name is: "+name +" and age is: "+age);
	}
	 
	@Parameters
	public Collection<Object[]> parameter(){
	Object[][] pData=new Object[2][2];
	pData[0][0]="Tom";
	pData[0][1]=30;
	pData[1][0]="Harry";
	pData[1][1]=40;
	return Arrays.asList(pData);

}
	}}
