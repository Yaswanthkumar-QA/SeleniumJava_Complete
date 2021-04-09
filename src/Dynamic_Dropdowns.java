import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		// xpath for Chennai : //*[@value='MAA']
		// xpath for Bangaluru : //*[@value='BLR']
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//Chennai locate in dynamic dropdown : //div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr[3]/td[7]/a")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement sd2=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dd2 = new Select(sd2);		
		dd2.selectByIndex(3);
		//dd2.selectByIndex(4);
		//dd2.selectByIndex(2);
		System.out.println(dd2.getFirstSelectedOption().getText());
		
		WebElement sd3=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select dd3 = new Select(sd3);
		
		dd3.selectByIndex(2);
		//dd3.selectByIndex(4);
		//dd3.selectByIndex(3);
		System.out.println(dd3.getFirstSelectedOption().getText());
		
		WebElement sd4=driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select dd4 = new Select(sd4);
		
		dd4.selectByIndex(2);
		//dd4.selectByIndex(1);
		//dd4.selectByIndex(4);
		System.out.println(dd4.getFirstSelectedOption().getText());
		
		WebElement sd5=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dd5 = new Select(sd5);		
		dd5.selectByIndex(3);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
