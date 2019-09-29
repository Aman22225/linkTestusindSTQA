import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
public class A {
	
	static String driverPath = "C:\\Gecko\\geckodriver.exe";
	public static WebDriver driver;
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver",driverPath);
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette",true);
	driver= new FirefoxDriver(capabilities);
	driver.get("http://localhost/Pract/Combo.html");
	java.util.List<WebElement> links = driver.findElements(By.tagName("option"));
	System.out.println("Total combobox items are "+links.size());
	for (int i = 0; i<links.size(); i=i+1)
	{ System.out.println("Combo Box Element : "+ links.get(i).getText()); }
	}


}
