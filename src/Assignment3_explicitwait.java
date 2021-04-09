//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait assign=new WebDriverWait(driver,6);
		
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		
		assign.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='results']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
		

	}

}
