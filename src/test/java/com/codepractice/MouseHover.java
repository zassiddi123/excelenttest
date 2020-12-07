package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 
		  Actions ac= new Actions(driver);
	  WebElement from=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	WebElement to=driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
	
	ac.moveToElement(from).moveToElement(to).click().build().perform();
	
	/*ScreenShot v=new ScreenShot();
	     v.screenshot(driver, "name");*/
	ScreenShot.screenshot(driver, "p2");
	}

}
