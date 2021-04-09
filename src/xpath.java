import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		driver.getCurrentUrl();
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("yaswanthkumar94@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("yaswanth1234");
		driver.findElement(By.name("login")).submit();
		//driver.findElement(By.xpath("//*[@id=\'mount_0_0_Ks\']/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/i")).submit();
		//driver.findElement(By.xpath("//*[@id=\'mount_0_0_Ks\']/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span")).submit();
		
		

	}

}
