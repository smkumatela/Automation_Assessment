/*
Author: Songezo Mkumatela
Test Case Name: Page Factory
Date: 16/05/2019
*/
//#########################################################################
package iLAB_Objects_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Page_Factory {
	
	protected WebDriver driver;
	
	public Page_Factory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
  @Test
  public void f() {
  }
}
