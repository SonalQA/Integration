package com.example.grid;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParallelTestFf {
  RemoteWebDriver driver;
	WebElement element;

  @Test
  public void f() throws MalformedURLException, InterruptedException{
	new DesiredCapabilities();
	DesiredCapabilities cap = DesiredCapabilities.firefox();
	  cap.setPlatform(Platform.LINUX);
	  cap.setBrowserName("firefox");
	  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap); 
      System.out.println("test Started");

	  driver.navigate().to("https://www.google.com/");
	Thread.sleep(10000); 

      WebElement searchEdit = driver.findElement(By.name("q"));
      searchEdit.sendKeys("docker Selenium");
      searchEdit.submit();
    	Thread.sleep(50000); 

      System.out.println("test ends");
        }		


  @AfterTest
	public void dquit() {
driver.quit();
System.out.println("driver exited");


	}
  
  
}
 

