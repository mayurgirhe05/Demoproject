package com.task_frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Frame_Handle {
	
	@Test
	public void test() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.id("account_dd")).click();
		driver.findElement(By.id("user_sign_in_sign_up")).click();
		
		
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		if(frame.isDisplayed())
			driver.switchTo().frame(frame);
		else
			System.out.println("no frame available");
		
		WebDriverWait wait=new WebDriverWait(driver,50);
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("mobileNoInp"))));

		
		driver.findElement(By.id("mobileNoInp")).sendKeys("76666318583");
		
	}

	}
		


		
		
		

