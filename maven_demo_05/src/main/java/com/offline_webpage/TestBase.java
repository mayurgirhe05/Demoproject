package com.offline_webpage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class TestBase {
	public WebDriver driver=null;
	FileInputStream fis=null;
	
	public String readProperties(String key){
	Properties prop=new Properties();
	
	
	
	try{
		fis=new FileInputStream(System.getProperty("user.dir"+"src/main/resources/config.properties"));
		
	}catch (FileNotFoundException e){
	
		e.printStackTrace();
		
	}
	return prop.getProperty(key);

	}
	public void launchBrowser(){
		driver.get(readProperties("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
}
	public WebDriver initialization(){
		if(readProperties("browser").equals("chrome")){
	
	}
	return driver;
	}
}