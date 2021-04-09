import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// 1. No.of link in entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. No.of links in footer section (Hint: By limiting driver scope)
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// 3. Footer section first column links count
		WebElement columndriver=footerdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each and every link in column section, check it opening or not
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			// Opening each and every link in separate window
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
			// Get the title from each and every title from every window
			
		}
		
		Thread.sleep(10000);
			
			Set<String> childWindows=driver.getWindowHandles();
			Iterator<String>it =childWindows.iterator();
		
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			

		
	}

}
