package com.example.grid;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParallelTest {
  RemoteWebDriver driver;
  @Test
  public void f() throws  MalformedURLException{
	new DesiredCapabilities();
	DesiredCapabilities cap = DesiredCapabilities.firefox();
	  cap.setPlatform(Platform.LINUX);
	  cap.setBrowserName("firefox");
	  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap); 
      System.out.println("test begins");
	  driver.navigate().to("https://www.google.com/");
      WebElement searchEdit = driver.findElement(By.name("q"));
      searchEdit.sendKeys("docker Selenium");
      searchEdit.submit();
      System.out.println("test ends");
        }

 
}
