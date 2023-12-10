package com.project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadEx {
	@Test
	public void Test01() throws Exception{
		System.setProperty("webdriver.chrome.driver", "chromedriverAutoIt.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/playground/file-upload");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("file")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");
		
		
	}

}
