import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("facebook");
		driver.findElement(By.xpath("//*[@name='q']")).submit();
		
	}

}
