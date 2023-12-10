package com.window_handles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	@Test
	public void Test1(){
		//Lunch Chrome Browser
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// poen url
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String title=driver.getTitle();

		System.out.println(title);

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String>handle=driver.getWindowHandles();
		Iterator<String> It=handle.iterator();
		String Parentwindowid=It.next();
		System.out.println("Parant window is"+ Parentwindowid);

		String Childwindowid= It.next();
		System.out.println("CHild window is"+ Childwindowid);

		String title1=driver.getTitle();



		WebElement firstname= driver.findElement(By.id("firstName"));

		firstname.sendKeys("Mayur");

		WebElement lastname =driver.findElement(By.id("lastName"));

		lastname.sendKeys("GIrhe");

		driver.findElement(By.id("malerb")).click();







	}

}
