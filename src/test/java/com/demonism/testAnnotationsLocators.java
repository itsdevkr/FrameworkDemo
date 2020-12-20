package com.demonism;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.validate.pageObjectPO;

public class testAnnotationsLocators {
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void browserSetUp() {
		WebDriverWait.chromedriver().setup();
		driver = new WebDriver();
		driver.get("file:///C:/Users/ThinkPad/Downloads/xpath%20(1).html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.seconds)
	}
	
	@Test
	public void locatorsAnnotations() {
		for(int i=0;i< po.getsize();i++) {
			
			po.getAllRadioButtons()
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
