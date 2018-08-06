package com.example.grid;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InsyghtsLogin {
	WebDriver driver;
	WebElement element;
	  @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "C:\\SelDrivers\\chromedriver.exe");
		  driver = new ChromeDriver();  
			driver.manage().window().maximize();


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
		Thread.sleep(10000);
		
		System.out.println("I am waiting to click on location from Home Page");
		driver.findElement(By.xpath(".//*[@class='home-box-bottom-left home-panel']/ul/li[1]")).click();
		Thread.sleep(5000);
		System.out.println("I am inside of location details");
		driver.findElement(By.xpath(".//*[@id='input-dropdown-additional-customer-actions']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Edit Location')]")).click();
		System.out.println("I am on Edit location modal");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label//span[text()='City']//following::input[1]")).sendKeys("SONAL");
		Thread.sleep(2000);

	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(".//div[contains(@class,'VirtualizedSelectOption')]//span[contains(text()='SONAL')]")));
           
           
/*		System.out.println("I am waiting to click on location");
		driver.findElement(By.xpath(".//*[@class='home-box-bottom-left home-panel']/ul/li[1]")).click();
		Thread.sleep(10000);
		
		System.out.println("I am inside of location details");
		driver.findElement(By.xpath(".//*[@id='input-dropdown-additional-customer-actions']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Edit Location')]")).click();
		System.out.println("I am on Edit location modal");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//label//span[text()='City']//following::input[1]")).sendKeys("CEDAR ROCK");
		Thread.sleep(2000);

		System.out.println("I am selecting City value");
		driver.findElement(By.xpath("//label//span[text()='City']//following::input[1]")).sendKeys(Keys.ENTER);
		System.out.println("I am selecting State value");
		driver.findElement(By.xpath("//label//span[text()='State']//following::input[1]")).sendKeys("CA");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label//span[text()='State']//following::input[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[contains(text(), 'Save changes')]")).click();
		Thread.sleep(3000);*/
		
		
  }
	
	 //Creating a custom function
		public void highLighterMethod(WebDriver driver, WebElement element){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		}
}
