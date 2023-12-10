package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
@Test
	public void loginpage() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Driver Load

		// create object of login page
		LoginPage pg = new LoginPage(driver);

		// open url
		driver.get(
				"file:///D:/Selenium%20Software/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		pg.enterusername("kiran@gmail.com");

		pg.enterpassword("123456");

		pg.clickonloginbtn();

	}
}