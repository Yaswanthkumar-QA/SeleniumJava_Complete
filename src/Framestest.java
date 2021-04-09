import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framestest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		//WebElement jquery=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//driver.switchTo().frame(jquery);
		//driver.findElement(By.id("draggable")).click();
	
		
		Actions drag= new Actions(driver);
		
		drag.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		System.out.println("It's Done");
		driver.switchTo().defaultContent(); // This is compulsory
		

	}

}
