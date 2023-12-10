package com.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_JavaScriptEx {
	
	@Test
	public void Test1(){

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/playground");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	 
	WebElement link=driver.findElement(By.linkText("Login"));
	js.executeScript("arguments[0].scrollIntoView(true);", link);
	
	
		
		
		
	}

}
