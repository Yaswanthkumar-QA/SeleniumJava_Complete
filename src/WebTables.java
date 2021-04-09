import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {

		// Assignment7
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	/*
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		List<WebElement> totalRows = driver.findElements(By.cssSelector(".table-display tbody tr"));
		List<WebElement> totalCol = driver.findElements(By.cssSelector(".table-display tbody tr th"));

		System.out.println(totalCol.size());

		System.out.println(totalRows.size() - 1);
		System.out.println(totalRows.get(2).getText());
	*/
		
	
		WebElement table=driver.findElement(By.id("product"));
		 
		System.out.println(table.findElements(By.tagName("tr")).size());
		  
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		 
	    List<WebElement>secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		  
	    System.out.println(secondrow.get(0).getText());
		 
		System.out.println(secondrow.get(1).getText());
		  
		System.out.println(secondrow.get(2).getText());
		
	 

	}

}
