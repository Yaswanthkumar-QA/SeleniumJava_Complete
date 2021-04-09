import org.openqa.selenium.edge.EdgeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium code-
		
				//Step-1: Create Driver Object
					// For Edge Web Driver : 
						/*
						  Class name = ChromeDriver;
						      ChromeDriver driver=new ChromeDriver();
						 */
				// Web Driver is an Interface, so we will strictly implement
				//Step-2: Invoke .exe file
				System.setProperty("webdriver.edge.driver","F:\\work\\WebDriver\\msedgedriver.exe");
				EdgeDriver driver=new EdgeDriver();
				driver.get("http:\\google.com");
				System.out.println(driver.getTitle());
				//driver.get("http:\\gmail.com");
				
	}

}
