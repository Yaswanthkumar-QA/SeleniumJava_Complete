import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		
		String optionSelected=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
		
		WebElement sd2=driver.findElement(By.id("dropdown-class-example"));
		Select dd2 = new Select(sd2);		
		dd2.selectByVisibleText(optionSelected);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(optionSelected);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String requiredText= driver.switchTo().alert().getText();
		
		if(requiredText.contains(optionSelected))
		{
			System.out.println("Text matches successfully");
		}
		else
			System.out.println("Text doesn't match");

	}

}
