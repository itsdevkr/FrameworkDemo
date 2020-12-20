package com.validate;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageObjectPO {
	
	public pageObjectPO(WebDriver driver) {
		
	}
	
	@FindBy(xpath="//input[@placeholder='Full Name']")
	WebElement username;
	public WebElement setUserName() {
		return username;
	}
	
	@FindBy(how=How.XPATH, using="username")
	WebElement username1;
	public WebElement setUserName1() {
		return username1;
	}
	
	@FindBy(xpath="//input[@type='radio']")
	List<WebElement> allRadioButtons;
	public List<WebElement> allRadioButtons(){
		return allRadioButtons;
	}
	
	public int getSize() {
		return allRadioButtons.size();
	}
	
	public WebElement getAllRadioButtons(int i) {
		return getAllRadioButtons
	}
	
	@FindAll({
		@FindBy(xpath="//input[@type='radio']"),
		@FindBy(xpath="//input[@type='checkbox']"),
		@FindBy(xpath="//input[@type='text']")
		})
	List<WebElement> allRadioCheckTextbox;
	public List<WebElement> allRadioCheckTextbox(){
		return allRadioCheckTextbox;
	}
	

}
