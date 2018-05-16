package qaeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class QAT3 {
	 	 
	 @Test
	 public void verify() {
		 WebDriver driver = new FirefoxDriver();
	       driver.get("http://blazemeter.com");

	       WebElement title = driver.findElement(By.xpath("//title"));

	       System.out.println("********************************************************");

	       System.out.println("*" + title.getAttribute("text") + "*");

	       System.out.println("********************************************************");

	       driver.quit();
	 }
}
