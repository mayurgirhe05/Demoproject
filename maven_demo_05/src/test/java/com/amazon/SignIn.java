package com.amazon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn {
	WebDriver driver;
	
	
	@BeforeTest
	public void Test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		// Open Url
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		
		@Test(priority=1)
		public void SignIn() throws Exception{
			
		WebElement searchBox= driver.findElement(By.id("nav-link-accountList"));
		
		searchBox.click();
		
		
		WebElement email= driver.findElement(By.id("ap_email"));
		
		email.sendKeys("7666318583");
		
		WebElement submit =driver.findElement(By.id("continue"));
		
		submit.submit();
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Mayur@123");
		
		WebElement CheckBox=driver.findElement(By.name("rememberMe"));
		CheckBox.click();
		
		WebElement Submit=driver.findElement(By.name("signInSubmit"));
		Submit.click();
		}
		
		@Test(priority=2)
		public void searchbox(){
		
		WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));
		
		SearchBox.sendKeys("realme 11 pro 5+g");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	//@AfterTest
	//public void aftertest(){
	//	driver.quit();
		
}	
	


