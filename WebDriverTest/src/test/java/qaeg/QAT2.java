package qaeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class QAT2 {
	 @Test
	 public void test() {
		 System.out.println("I am in src-test-java");
		 
	 }
	 
	 @Test
	 public void verify() {
		 // System.setProperty("webdriver.chrome.driver", "C:\\SelDrivers\\chromedriver.exe");


		  //  WebDriver driver = new FirefoxDriver();
		   WebDriver driver = new ChromeDriver();

	       driver.get("http://blazemeter.com");

	       WebElement title = driver.findElement(By.xpath("//title"));

	       System.out.println("********************************************************");

	       System.out.println("*" + title.getAttribute("text") + "*");

	       System.out.println("********************************************************");

	       driver.quit();
	 }
}
