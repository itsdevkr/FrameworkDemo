package com.demonism;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestExecutionOrder {
	
	@Test(priority=1)
	public void Test() {
		System.out.println("Test method executed");
	}
	
	@Test(groups= {"smoke"}, invocationCount = 2)
	public void Register() {
		System.out.println("Registration Successful");
		Reporter.log("Registered", true);
	}
	
	@Test(priority=3, dependsOnMethods= {"Register"}, groups= {"regression"})
	public void Login() {
		System.out.println("Login Successful");
	}
	
	@Test(priority=2, groups= {"regression"}, enabled = true)
	public void DeleteUser() {
		System.out.println("User is Deleted");
	}
}
