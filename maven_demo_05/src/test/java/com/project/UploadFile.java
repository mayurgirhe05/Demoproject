package com.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		// Lunch Chrome Browser	
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mayur\\TestSelenium\\maven_demo_05\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins--");
		
		
		
		WebDriver driver=new ChromeDriver(options);

		
		//Maximize Browser
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		
		
		
		//Open Url
		driver.get("https://demoqa.com/upload-download");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		// Find webelement Choose file
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Mayur\\Desktop");


	}

}
