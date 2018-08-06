package com.example.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OppLogin {
	  RemoteWebDriver driver;
	  WebElement element;
	  @BeforeTest
	  public void beforeTest() throws MalformedURLException {
			new DesiredCapabilities();
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			  cap.setPlatform(Platform.LINUX);
			  cap.setBrowserName("firefox");
			  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap); 
			  
/*		 System.setProperty("webdriver.chrome.driver", "C:\\SelDrivers\\chromedriver.exe");
		  driver = new ChromeDriver();  
			driver.manage().window().maximize();*/


	  }
  @AfterTest
	  public void afterTest() {
			driver.quit();			

	  }
	@Test
  public void editLocation() throws InterruptedException  {
		driver.get("https://stage-insyghts.entytle.com/en/login"); 
		 element = driver.findElement(By.id("email"));
		 highLighterMethod(driver, element);
		 element.sendKeys("Admin+298+21@entytle.com");
		element = driver.findElement(By.id("password"));
		 highLighterMethod(driver, element);
		 element.sendKeys("bingo");

		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		Thread.sleep(20000);
		
		System.out.println("I am waiting to click on opportunity from Home Page");

		driver.findElement(By.xpath(".//*[@class='home-box-bottom-right home-panel']/ul/li[1]")).click();
		System.out.println("I am inside of opportunity details and waiting");
		Thread.sleep(10000);
		

		driver.findElement(By.xpath("//button//span[contains(@class,'icon-order-history-alt-1')][1]")).click();
		
		Thread.sleep(10000);

		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='opportunity-detail-opp-line-order-history-modal']//table/thead/tr/th[2]")).click();	
		Thread.sleep(5000);

  }
	
	 //Creating a custom function
		public void highLighterMethod(WebDriver driver, WebElement element){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		}
}
