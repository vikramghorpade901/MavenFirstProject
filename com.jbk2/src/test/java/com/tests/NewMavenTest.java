package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewMavenTest {

	@Test
	public void test () {
		System.setProperty("webdriver.edge.driver", "msedgedriver1.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/vikra/Desktop/JBK/Selenium/Software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html"); 

		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			String s = driver.getTitle();
			driver.close();
			Assert.assertEquals(s, "JavaByKiran | Dashboard");
			
	}}
	
	
	
	

