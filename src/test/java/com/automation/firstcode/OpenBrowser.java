package com.automation.firstcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		

	}

}
