package com.offline_webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;

@FindBy(id="email")
public WebElement email;

@FindBy(id="password")
public WebElement password;

 @FindBy(xpath="//button")
public WebElement button;
 
 public LoginPage(WebDriver driver){
	 PageFactory.initElements(driver, this);
 }
 
 public void correctCredentials(){
	 email.sendKeys("kiran@gmail.com");
     password.sendKeys("123456");
     button.click();
     
 }
}
