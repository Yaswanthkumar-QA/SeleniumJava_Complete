import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximizewindow_deletingcookie {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Deleting all cookies
		driver.manage().deleteAllCookies();
		//Deleting one cookie
		//driver.manage().deleteCookieNamed("Here to give cookie name");
		// Click on any link
		//Login page-verify login URL
		
		
		driver.get("http:\\google.com");
		
		
		

	}

}
