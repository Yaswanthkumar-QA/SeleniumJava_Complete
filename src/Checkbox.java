import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		
		//Count No.of Checkboxes - first we locate common attribute
		
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		/*WebElement sd5=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd5 = new Select(sd5);		
		dd5.selectByIndex(2);
		*/
		
		Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText(),"INR");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		
		
		
		

	}

}
