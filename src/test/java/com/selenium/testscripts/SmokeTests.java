package com.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;



public class SmokeTests{
	
	
	public static WebDriver driver;
	@Test
	public void testOne() throws Exception {
		
		TestScreenRecorder.startRecording("navigationTest"); 
		
		WebDriver driver = new SafariDriver(); 
		// Amiri doesn't like git commands

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123"); 
		WebElement login = driver.findElement(By.name("Submit"));
		login.click();
		System.out.println(driver.getTitle());
		driver.quit();
		TestScreenRecorder.stopRecording();
	}

}
