import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filters_table {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement>veggies=driver.findElements(By.xpath("//tr/td[1]")); // 5 Results
		List<WebElement>filteredlist=veggies.stream().filter(v->v.getText().contains("Rice")).collect(Collectors.toList());
		//filteredlist only 1 item
		
		Assert.assertEquals(veggies.size(), filteredlist.size());
		
		
		
		

	}

}
