import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Https_certifications {

	public static void main(String[] args) {
		
		
		//SSL Certifications
		
		//Desired Capabilities
		//General Chrome Profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		//Selenium to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		System.setProperty("WebDriver.chrome.driver", "F:\\work\\WebDriver\\chromedriver");
		WebDriver driver=new ChromeDriver(c);
		
		

	}

}
