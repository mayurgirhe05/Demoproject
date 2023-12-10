package com.test_window_handle;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class WindowEx{

	public void test01() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20Software/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		driver.manage().window().maximize();

		String mainWin= driver.getWindowHandle();  //parent window

		List<WebElement> links = driver.findElements(By.partialLinkText("More info"));
		for(WebElement link:links)
			link.click();  // 5 window

		Set<String>handles= driver.getWindowHandles(); // 5 values
		for(String win: handles) {
			System.out.println("handle of a wondow:"+win);

			if(!win.equals(mainWin)){
				driver.switchTo().window(win);
				Thread.sleep(9000);
				System.out.println(driver.getCurrentUrl());
				driver.close();		}

		}
	}
}