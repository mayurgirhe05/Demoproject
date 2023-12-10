package com.all_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseSendKeyboard {



	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 1)
	public void test_func1() throws InterruptedException {
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.moveToElement(element)
		.keyDown(Keys.SHIFT)
		.sendKeys("Selenium Webdriver")
		.keyUp(Keys.SHIFT)
		.doubleClick()
		.contextClick()
		.build()
		.perform();
		Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void test_func2() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement holdObject = driver.findElement(By.id("draggable"));
		WebElement releaseHere = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.clickAndHold(holdObject)
		.moveToElement(releaseHere)
		.release()
		.build()
		.perform();
		Thread.sleep(7000);
	}
	@Test(priority = 3)
	public void test_func3() throws InterruptedException {
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement holdObject = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(holdObject, 370, 250)
		.build()
		.perform();
		Thread.sleep(7000);
	}
	@Test(priority = 4)
	public void test_func4() throws InterruptedException {
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveByOffset(700, 365).contextClick()
		.build()
		.perform();
		Thread.sleep(7000);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}