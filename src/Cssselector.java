import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://salesforce.com");
		driver.findElement(By.xpath("//div[@class='dropdown']/a")).click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("linkedin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}
