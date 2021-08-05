package Selenium_day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;


import org.junit.BeforeClass;
import org.junit.AfterClass;


public class junitTestingExample {

	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class Runs");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class Ran");
	}
	
	
	
	
	

	@Test
	public void Test() {
		System.out.println("Test1");
	}
	

	@Ignore
	@Test 
	public void Test2() {
		System.out.println("Test2");
	}
	

	@Test
	public void Test3() {
		System.out.println("Test3");
	}
	

	@Test
	public void Test4() {
		System.out.println("Test4");
	}
	
	
	@Before
	public void beforeMethod() {
		System.out.println("BeforeTest");
	}

	@After
	public void afterMethod() {
		System.out.println("AfterTest");
	}

}
