import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Selenium code-
		
		//Step-1: Create Driver Object
			// For Chrome Web Driver : ChromeDriver
				/*
				  Class name = ChromeDriver;
				      ChromeDriver driver=new ChromeDriver();
				 */
		// Web Driver is an Interface, so we will strictly implement
		//Step-2: Invoke .exe file
		System.setProperty("webdriver.chrome.driver","F:\\work\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\google.com");
		System.out.println(driver.getTitle());  // Check page title
		//driver.get("http:\\gmail.com");
		
		System.out.println(driver.getCurrentUrl()); //Check link correct or not
		// System.out.println(driver.getPageSource()); // To print page source in our console
		driver.get("http:\\yahoo.com");
		driver.navigate().back(); // Page navigate to previous page * first open chrome opening the google open then yahoo page open and then redirect to back to google
		driver.close(); //Closes current browser
		// driver.quit(); // It closes all the browsers opened by selenium script
		
		
		

	}

}
