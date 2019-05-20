package iLAB_Driver_Script_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import iLAB_Objects_Package.Applying_Online;
import iLAB_Objects_Package.Populate_Form;

public class Driver_Script {
	
	@Test
	public void launch_Browser_Setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Mkumatela/WebDrivers/chromedriver.exe.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ilabquality.com/");
		
		Thread.sleep(5000);
		Applying_Online application = new Applying_Online(driver);
		application.clickCareers();
		Thread.sleep(5000);
		application.clickSouthAfricaLink();
		Thread.sleep(5000);
		application.clickAvailableJobLink();
		Thread.sleep(5000);
		application.clickApplyOnlineLink();
		
		Thread.sleep(5000);
		Populate_Form enterDetails = new Populate_Form(driver);
		enterDetails.enterName("Songezo");
		Thread.sleep(5000);
		enterDetails.enterEmail("automationAssessment@iLABQuality.com");
		Thread.sleep(5000);
		enterDetails.enterPhoneNumber("083 568 7859");
		Thread.sleep(5000);
		enterDetails.clickSendButton();
		
		if(driver.getPageSource().contains("You need to upload at least one file.")) {
			System.out.print("Documents Validation is visible ");
		}
		else
		{
			System.out.print("Documents Validation is not Visible ");
		}
	}

}
