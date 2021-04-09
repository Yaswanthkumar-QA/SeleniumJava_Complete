import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//div[@class='glow-toaster-footer']/span/span/input")).click();
		
		Actions mouseover=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		//mouseover.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Screwdriver for laptop").build().perform();  // This is just entering the text into the text box in capital letters
		mouseover.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Screwdriver for laptop").doubleClick().click().build().perform(); // This is selecting entire text which we enter into the text box
		//mouseover.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click().build().perform();
		// Mouse over action
		//mouseover.moveToElement(move).build().perform();
		mouseover.moveToElement(move).contextClick().build().perform();  // Right on particular element
		//Drag and drop will continue after frames
		

	}

}
