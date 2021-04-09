import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_ui {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		//
		driver.findElement(By.id("travel_date")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-days'] //*[@class='datepicker-switch']")).getText();
		
		//Month Year picker
		
		// While loop executes the loop until condition is false
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //*[@class='datepicker-switch']")).getText().contains("March 2022"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		// Grab the items 
		List<WebElement>dates=driver.findElements(By.className("day"));
		
		int count=dates.size();
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			
			if(text.equalsIgnoreCase("30"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
		

	}

}
