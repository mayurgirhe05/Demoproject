package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	LoginPage(WebDriver d) {
		driver = d;

	}

//locate webelement
	By username = By.id("email");
	By password = By.id("password");
	By button = By.xpath("//button");

	public void enterusername(String uname) {

		driver.findElement(username).sendKeys(uname);
	}

	public void enterpassword(String pwd) {

		driver.findElement(password).sendKeys(pwd);
	}
	public void clickonloginbtn() {

		driver.findElement(button).click();
	}
}
