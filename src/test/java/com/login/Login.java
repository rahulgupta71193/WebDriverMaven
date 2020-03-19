package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(5000);
	}
	@Test
	public void doLogin()
	{
		driver.get("www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("rahulkgp71193@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("Ri^tik@123");
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
