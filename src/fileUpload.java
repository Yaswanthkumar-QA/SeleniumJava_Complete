import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		String downloadpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadpath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://pdftoimage.com/");
		driver.findElement(By.id("pick-files")).click();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("F:\\work\\AutoIT Files\\fileupload.exe");
		//Thread.sleep(20000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='DOWNLOAD']")));
		driver.findElement(By.xpath("//div[text()='DOWNLOAD']")).click();
		Thread.sleep(5000);
		File f=new File(downloadpath+"/Test 3.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
			System.out.println("File Found");
			if(f.delete())
			{
				System.out.println("File got deleted");
			}
		}
		else
		{
			System.out.println("Error:File not found");
		}
		driver.close();
		
	}

}
