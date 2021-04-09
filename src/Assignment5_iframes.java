
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_iframes {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		
		

		
		
	}

}
