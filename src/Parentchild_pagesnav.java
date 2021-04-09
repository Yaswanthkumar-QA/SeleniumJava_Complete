import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild_pagesnav {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.className("blinkingText")).click();
		
		//String window= driver.getWindowHandle();
		
		/*
		 // If Multiple windows will open then we are using getWindowsHandle(), whereas single window we are using getWindowHandle()
		Set<String> windows= driver.getWindowHandles();      //[parent-child windows details]
		
		//Iterator<String>it = windows.iterator();
		//String parentId = it.next();
		//String childId = it.next();
		*/
		//driver.switchTo().window(window);
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0]);
		String emailId= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(emailId);
		
	}

}
