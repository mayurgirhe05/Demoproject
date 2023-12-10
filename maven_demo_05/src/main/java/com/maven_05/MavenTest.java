package com.maven_05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTest {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();	
driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
System.out.println("byy>>>>>>>>>>");
	}

}
