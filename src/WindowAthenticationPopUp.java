import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com"); // Not working because it don't handle window popup
		// To handle window popups also by using syntax: "https://username:password@siteurl"
		
		driver.get("https://admin:admin@the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
	}

}
