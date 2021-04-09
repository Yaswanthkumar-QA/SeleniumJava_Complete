import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Complete_validation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");

		
		//Select From-To
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//Select current Date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//Round-trip Validation
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Roundtrip not enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		//Checkbox clicking Friends and Family Citizen
		
		//driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();
		//driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiv]")).click();
		//driver.findElement(By.cssSelector("input[id*=IndArm]")).click();
		//driver.findElement(By.cssSelector("input[id*=Ltc]")).click();
		driver.findElement(By.cssSelector("input[id*=Govt]")).click();
		//driver.findElement(By.cssSelector("input[id*=StudentDiscount]")).click();
		//driver.findElement(By.cssSelector("input[id*=Unmr]")).click();
		//driver.findElement(By.xpath("//span[@class='hide-mobile']/a")).click();
		
	
								//Passengers Selected
		// No. of Adults			
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement sd2=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dd2 = new Select(sd2);		
		dd2.selectByIndex(1);
			
		/*
		 
		//No.of Child
		WebElement sd3=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select dd3 = new Select(sd3);
		dd3.selectByIndex(2);
		
		*/
				
		/*
		
		 //No. of Infants
		WebElement sd4=driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select dd4 = new Select(sd4);
		dd4.selectByIndex(2);
		
		*/
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		// Currency type 
		
		WebElement sd5=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd5 = new Select(sd5);
		dd5.selectByIndex(3);
		
		System.out.println((dd5.getFirstSelectedOption().getText()));
		
		
		// Clicking Search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
