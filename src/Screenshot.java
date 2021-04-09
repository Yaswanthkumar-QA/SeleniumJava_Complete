import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Deleting all cookies
		driver.manage().deleteAllCookies();
		// Deleting one cookie
		// driver.manage().deleteCookieNamed("Here to give cookie name");
		// Click on any link
		// Login page-verify login url

		driver.get("http:\\google.com");
		
		// 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\yaswanthkumar\\Documents\\screenshot.png"));
		
		

	}

}
