import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Webtable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
	/*				// Test Passed
		// Step1 : Click on column
		
		driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
		// Step2: Capture all webelement into list
		
		List<WebElement>element_List=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		
		// Step3: Capture all Webelements into list - original list
		
		List<String>original_List=element_List.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		// Step4: Sort inn the list of step3 -> sortedlist
		List<String>sorted_List=original_List.stream().sorted().collect(Collectors.toList());
		// step5: comparing original list vs sortedlist
		
		Assert.assertTrue(original_List.equals(sorted_List));   //Test Passed
		
		System.out.println(sorted_List);
	 */
		
	/*				// Test failed
			
			// Step1 : Click on column
		
				//driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
				// Step2: Capture all webelement into list
				
				List<WebElement>element=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
				
				// Step3: Capture all Webelements into list - original list
				
				List<String>original=element.stream().map(s->s.getText()).collect(Collectors.toList());
				// Step4: Sort inn the list of step3 -> sortedlist
				List<String>sorted=original.stream().sorted().collect(Collectors.toList());
				// step5: comparing original list vs sortedlist
				
				Assert.assertTrue(original.equals(sorted));  // Test fails here
	*/
		
		
	/*	
		
		//	Scan the name column and if we get with getText(), returns rice, then Price of the element will print in console
		
		List<String>prices= element_List.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVegies(s))
		.collect(Collectors.toList());
		prices.forEach(p->System.out.println(p));
	*/	
		
		//	Scan the name column and if we get with getText(), returns rice, then Price of the element will print in console
		
		List<String>prices;
		do
		{
		
			List<WebElement>rows=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
			prices= rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVegies(s))
				.collect(Collectors.toList());
				prices.forEach(p->System.out.println(p));
				
				if(prices.size()<1)
				{
					driver.findElement(By.xpath("//ul[@class='pagination pull-right']/li[7]")).click();
				}
		}while(prices.size()<1);
		
	}
	
		private static String getPriceVegies(WebElement s) {
		
			String priceval=s.findElement(By.xpath("following-sibling::td[1]")).getText();
			return priceval;
		
	}
		
		
		
		
		

}
