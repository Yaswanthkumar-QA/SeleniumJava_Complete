import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//Broken link means broken URL
			//step-1: is to get all URLs tied up to the links using selenium
			//step-2: Java Methods will call URL'S and get the status code
			//step-3: If status code >400 then that link called as broken link
		//String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		//String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		// Grab all URLs in the page
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a=new SoftAssert();
		
		
		for(WebElement link : links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode=conn.getResponseCode();
			System.out.println(responseCode);
			//  Hard Assertion
			//Assert.assertTrue(responseCode>400, "Page is not working i.e., broken link"+ link.getText() +"with Code"+ responseCode);
			//Soft Assertion
			a.assertTrue(responseCode<400, "Page is not working i.e., broken link "+  url +" with Code "+ responseCode);
	/*
			if(responseCode>400)
			{
				System.out.println("Page is not working i.e., broken link "+ link.getText() + "with Code "+ responseCode);
				//Assert.assertTrue(false);
			}
			else
				System.out.println("Page working fine "+ link.getText() + "with Code "+ responseCode);
	*/
		}
		a.assertAll();
		
		
		

	}

}
