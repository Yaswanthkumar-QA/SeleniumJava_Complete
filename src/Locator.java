import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				//driver.get("http:\\facebook.com");
				//System.out.println(driver.getTitle());
				//System.out.println(driver.getCurrentUrl());
				//driver.findElement(By.id("email")).sendKeys("yaswanthkumar94@gmail.com");
				//driver.findElement(By.id("pass")).sendKeys("yaswanth1234");
				//driver.findElement(By.name("login")).submit();
				//driver.findElementByName("login").submit();
				//driver.findElement(By.linkText("Forgotten password?")).click();
				
				
				// Salesforce Example by using className
				driver.get("http:\\salesforce.com");
				//System.out.println(driver.getTitle());
				//System.out.println(driver.getCurrentUrl());
				driver.navigate().to("http:\\login.salesforce.com/?locale=in");
				driver.findElement(By.name("username")).sendKeys("Hi");
				driver.findElement(By.name("pw")).sendKeys("1234");
				//driver.findElement(By.name("Login")).submit();
				
				
				// email field and password field has same name then selenium identifies first one - It scans from top left
				
								
				
	}

}
