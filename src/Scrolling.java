

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=5000");
		
		// Handling Table Grids
		
		List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0;i<values.size();i++)
		{
			sum=sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println("Sum is "+ sum);
		
		int sumValue=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		//Assert.assertEquals(sum, sumValue);
		
		if(sum==sumValue)
		{
			System.out.println("Both matches Successfully");
		}
		else
			System.out.println("Both are not marching");
		
		//js.executeScript("document.querySelector(\'table[id='product']\')");
		
		//Sum of Price column values
		
		List<WebElement>products=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int prodsum=0;
		for(int j=0;j<products.size();j++)
		{
			System.out.println(Integer.parseInt(products.get(j).getText()));
			prodsum=prodsum + Integer.parseInt(products.get(j).getText());
			
		}
		
		System.out.println("Product Sum is "+ prodsum);
		
		
	}

}
