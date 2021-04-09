import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		
		
		//Count No. of check boxes in page
		
		driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		

	}

}
