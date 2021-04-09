import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		// Done it in Ecommerce

	}

}
