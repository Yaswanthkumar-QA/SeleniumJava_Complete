import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete_dd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Unit");
		Thread.sleep(3000);
		
		List<WebElement> options =driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("United States (USA)"))
			{
				//System.out.println(option.getText());
				option.click();
				break;
			}
		}
		

	}

}
