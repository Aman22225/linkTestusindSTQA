package Practical6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities; 
public class Links {
	static String driverPath = "D:\\selenium\\geckodriver.exe"; 
	public static WebDriver driver;
	public static void main(String args[])
	{ 
		System.setProperty("webdriver.gecko.driver",driverPath); 
		//System.out.println("hi"); 
		DesiredCapabilities capabilities = DesiredCapabilities.firefox(); 
		capabilities.setCapability("marionette",true); 
		driver= new FirefoxDriver(capabilities);
		driver.get("https://www.facebook.com/"); 
		//System.out.println("hello"); 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are"+links.size());
		for (int i = 0; i<links.size(); i=i+1)
		{ 
			// System.out.println("hello2"); 
			 System.out.println("Link "+ i + " Link name "+ links.get(i).getText());
	    }
	}
		
}
