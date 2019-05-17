/*
Author: Songezo Mkumatela
Test Case Name: Page Factory
Date: 16/05/2019
*/
//#########################################################################
package iLAB_Objects_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Populate_Form extends Page_Factory{
	
	@FindBy(xpath = "//*[@id=\"applicant_name\"]")
	private WebElement NameTextBox;
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement EmailTextBox;
	@FindBy(xpath = "//*[@id=\"phone\"]")
	private WebElement PhoneNoTextBox;
	@FindBy(xpath = "//*[@id=\"wpjb_submit\"]")
	private WebElement SendApplicationBtn;
	@FindBy(xpath = "//*[@id=\"wpjb-apply-form\"]/fieldset[1]/div[5]/div/ul/li")
	private WebElement ErrorMessage;
	
	public Populate_Form(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isInitialized() {
		return NameTextBox.isDisplayed();
		
	}
	
	public void enterName(String name) {
		this.NameTextBox.clear();
		this.NameTextBox.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		this.EmailTextBox.clear();
		this.EmailTextBox.sendKeys(email);
	}
	
	public void enterPhoneNumber(String phoneNumber) {
		this.PhoneNoTextBox.clear();
		this.PhoneNoTextBox.sendKeys(phoneNumber);
	}
	
	public void clickSendButton() {
		SendApplicationBtn.click();
	}
	
	public void checkError(String checkingErrorMessage) {
		ErrorMessage.getText();
	}
	

@Test
  public void f() {
  }
}
