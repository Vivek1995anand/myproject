package com.test;

import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_login {
	
	WebDriver driver;
	@Test
	public void login_Test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chrome driver\\chromedriver1_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    driver.get("https://opensource-demo.orangehrmlive.com/");
    
    
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    driver.quit();
	}
	
	//git practice
}
