package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {

	/*
	@BeforeSuite--setUp system property for chrome--1
	@BeforeTest--launch Chrome Browser--11
	@BeforeClass--login to app--111

	@BeforeMethod--enter URL
	@Test--googleLogo Test
	@AfterMethod--logout from app

	@BeforeMethod--enter URL
	@Test--Google Title Test
	@AfterMethod--logout from app

	@BeforeMethod--enter URL
	@Test--search Test
	@AfterMethod--logout from app

	@AfterClass--closeBrowser
	@AfterTest--deleteAllCoockies
	*/

	//pre conditions annotations -- starting with @Before

	@BeforeSuite//1
	public void setUp() {
	System.out.println("@BeforeSuite--setUp system property for chrome");
	}
	@BeforeTest//2
	public void launchBrowser() {
	System.out.println("@BeforeTest--launch Chrome Browser");
	}
	@BeforeClass//
	public void login() {
	System.out.println("@BeforeClass--login to app");
	}

	/*
	* @BeforeMethod
	* @Test--1
	* @AfterMethod
	*
	* @BeforeMethod
	* @Test--2
	* @AfterMethod
	*
	* @BeforeMethod
	* @Test--3
	* @AfterMethod
	*
	* */

	@BeforeMethod//4
	public void enterURL() {
	System.out.println("@BeforeMethod--enter URL");
	}
	//Test case-- Starting with @Test
	@Test//5-1 test case
	public void googleTitleTest() {
	System.out.println("@Test--Google Title Test");
	}
	    @Test//2 test case
	public void searchTest() {
	System.out.println("@Test--search Test");
	}
	    @Test// 3 test case
	public void googleLogoTest() {
	System.out.println("@Test--googleLogo Test");
	}
	//post conditions--Starting with @After
	@AfterMethod//6
	public void logout() {
	System.out.println("@AfterMethod--logout from app");
	}
	@AfterClass//7
	public void closeBrowser() {
	System.out.println("@AfterClass--closeBrowser");
	}
	@AfterTest//8
	public void deleteAllCoockies() {
	System.out.println("@AfterTest--deleteAllCoockies");
	}
	@AfterSuite//9
	public void generateTestReport() {
	System.out.println("@AfterSuite//9--generateTestReport");

}
}
