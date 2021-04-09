import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_switchings {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//div[@id='content'] //a[text()='Multiple Windows']")).click();	
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String>it = windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(parentId);		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	}

}
