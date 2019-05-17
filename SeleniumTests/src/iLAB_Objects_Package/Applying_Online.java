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
import iLAB_Objects_Package.Page_Factory;

public class Applying_Online extends Page_Factory{

	//Finding My Elements
	@FindBy(xpath = "//*[@id=\"menu-item-1373\"]/a")
	private WebElement CareersLink;
	@FindBy(xpath = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div/div[3]/a")
	private WebElement SouthAfricaLink;
	@FindBy(xpath = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/span[1]/a")
	private WebElement AvailableJobLink;
	@FindBy(xpath = "//*[@id=\"wpjb-scroll\"]/div[1]/a")
	private WebElement ApplyOnlineLink;
	
	public Applying_Online(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isinitialized() {
		return CareersLink.isDisplayed();
	}
	
	public void clickCareers() {
		CareersLink.click();
	}
	
	public void clickSouthAfricaLink() {
		SouthAfricaLink.click();
	}
	
	public void clickAvailableJobLink() {
		AvailableJobLink.click();
	}
	
	public void clickApplyOnlineLink() {
		ApplyOnlineLink.click();
	}
	
	
	
  @Test
  public void f() {
  }
}
