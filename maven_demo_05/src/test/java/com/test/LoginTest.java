package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.offline_webpage.LoginPage;
import com.offline_webpage.TestBase;

public class LoginTest extends  TestBase{
WebDriver driver;
	
	public static LoginPage lp;
	
	@Test
	public void VerifyTitleOfPage(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver Load

		driver.get("file:///D:/Selenium%20Software/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize(); // maximize
		
		lp=new LoginPage(driver);
		
		lp.correctCredentials();
		
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
		

}
}