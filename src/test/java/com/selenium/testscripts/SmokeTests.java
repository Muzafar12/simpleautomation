package com.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;



public class SmokeTests{
	
	
	public static WebDriver driver;
	@Test
	public void testOne() throws Exception {
		
		WebDriver driver = new SafariDriver(); 		// Launch Website 
		driver.navigate().to("http://www.google.com/"); 

		// Click on the search text box and send value 
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("BrowserStack");
		// Click on the search button 
		WebElement searchbtn = driver.findElement(By.name("btnK"));
		searchbtn.click(); 
		
		Thread.sleep(5000);
		// Close the Browser 
		driver.quit();
		
	}

}
