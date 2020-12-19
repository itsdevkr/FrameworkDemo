package com.demonism;

import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	public void Test() {
		System.out.println("Test method executed");
		}
	
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite method executed");
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite method executed");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass method executed");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("AfterClass method executed");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest method executed");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("AfterTest method executed");
	}
	}
