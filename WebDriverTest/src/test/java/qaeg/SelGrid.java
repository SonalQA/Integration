package qaeg;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SelGrid {
	@Test 
	public void gridVerify() throws MalformedURLException{
//     new DesiredCapabilities();
     URL serverurl = new URL("http://172.16.16.78:4444/wd/hub");
     DesiredCapabilities capabilities = DesiredCapabilities.chrome();
     capabilities.setPlatform(Platform.LINUX);
     WebDriver driver = new RemoteWebDriver(serverurl,capabilities);
     
 driver.get("http://www.google.com");
 WebElement searchEdit = driver.findElement(By.name("q"));
 searchEdit.sendKeys("Selftechy on google");
 searchEdit.submit();
 driver.quit();
/*	 String geckoDriverPath = "/usr/bin/geckodriver";

	 System.setProperty("webdriver.gecko.driver", geckoDriverPath);

	// WebDriver driver = new FirefoxDriver();

	  
	    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	    capabilities.setCapability(FirefoxDriver.BINARY,new File(geckoDriverPath).getAbsolutePath());
	    driver = new RemoteWebDriver(new URL("http://http://192.168.1.129:4444/wd/hub"), capabilities);
	     
	         
	       driver.get("http://google.com");
	       System.out.println(driver.getTitle());*/
	     
	      
	}
	   

}
