import java.util.Arrays;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,5);
		/*
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[5]/div[3]/button")).click();
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='cart-info']")).getText());
		*/
		//Creating Array for Products
		
		String[] itemsNeeded= {"Cucumber","Mushroom","Apple","Beetroot","Carrot"};
		
		addItems(driver,itemsNeeded);  // for public static void addItems
		
		//Ecommerce ecom=new Ecommerce();
		//ecom.addItems(driver,itemsNeeded);
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@class='cart-preview active']")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@class='cart-info']")).getText());
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		//Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		//Explicit Wait - for specific element
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		
		
		
		
		
		
		
		
	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<=products.size();i++)
		{
			
			// Formatting it to get actual Vegetable Name
			String[] name=products.get(i).getText().split("-");
			String formatedName=name[0].trim();			
			// Check whether name extracted is present in array or not
			//Convert array into array list for easy list
			// Goal 1 : convert array into array list
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formatedName))
			{
				j++;
				// Click on Add to Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
			
		}
	}

}
