import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_parentchildrelation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("linkedin");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).submit();
	}

}
