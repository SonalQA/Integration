package qaeg;
import java.net.*;

//import org.junit.runner.RunWith;
//import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class ChromeRemoteDriver {
	 public static void main(String []args) throws MalformedURLException{
	        new DesiredCapabilities();
	            URL serverurl = new URL(" http://192.168.1.131:5566");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	            WebDriver driver = new RemoteWebDriver(serverurl,capabilities);
	        driver.get("http://www.google.com");
	        WebElement searchEdit = driver.findElement(By.name("q"));
	        searchEdit.sendKeys("Selftechy on google");
	        searchEdit.submit();

	    }
}
