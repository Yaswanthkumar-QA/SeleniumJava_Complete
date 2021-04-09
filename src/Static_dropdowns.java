import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Static_dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag
		
		/*WebElement sd=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//WebElement sd2=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		
		Select dropdown = new Select(sd);
		//Select dd2 = new Select(sd2);
		
		dropdown.selectByIndex(3);
		//dropdown.selectByIndex(1);
		//dropdown.selectByIndex(0);
		//dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//dropdown.selectByVisibleText("USD");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//dropdown.selectByValue("INR");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		
		*/
		// Operations on spicejet
		
		driver.get("https://spicejet.com");
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
		dd5.selectByIndex(2);
		
		

	}

}
