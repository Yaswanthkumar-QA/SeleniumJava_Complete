
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		Thread.sleep(3000);
		// System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().dismiss(); //Alerts will be blocked

		// No. of Adults

		WebElement adults = driver.findElement(By.id("Adults"));
		Select aud = new Select(adults);
		aud.selectByIndex(2);

		// No. of Childrens

		WebElement childrens = driver.findElement(By.id("Childrens"));
		Select chi = new Select(childrens);
		chi.selectByIndex(3);

		// Select Calender Date

		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a[class*=ui-state-active]")).click();

		// Click on More options

		driver.findElement(By.xpath("//*[@id='MoreOptionsDiv']")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");

		// Click on Search Flights

		driver.findElement(By.id("SearchBtn")).click();

		// Printing Error Message on Console

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}



									// ctrl+shift+F   ---- Align the code in proper way
