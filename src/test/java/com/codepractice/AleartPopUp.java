package com.codepractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AleartPopUp {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
	driver.findElement(By.xpath("//input[@name='submit']")).submit();
	
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();

	//System.out.println(driver.switchTo().alert().getText());
	
      //String s=driver.switchTo().alert().getText();
	//System.out.println(s);
	//Assert.assertEquals(s, "Do you really want to delete this Customer?");
	//Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	
	
	
	}

}
