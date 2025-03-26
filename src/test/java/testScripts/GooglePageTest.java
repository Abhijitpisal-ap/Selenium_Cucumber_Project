package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
	
  @Test
  public void seleniumSearch() {
	  
	  // to test in specific version of version of Chrome use ChromeOptions -- provide browser version to be used as testing environment
//	  ChromeOptions options = new ChromeOptions();
//	  options.setBrowserVersion("120");
//	  WebDriver driver = new ChromeDriver(options);
	  
	  WebDriver driver = new ChromeDriver();
//	  WebDriver driver = new EdgeDriver();			// for edge browser - import EdgeDriver interface
	  
	  driver.manage().window().maximize();
	  
	  // to delete all cache and cookies
	  driver.manage().deleteAllCookies();
	  
//	  driver.get("https://www.google.com/");
//	  WebElement Searchbox= driver.findElement(By.id("APjFqb"));
//	  Searchbox.sendKeys("Selenium tutorials");
//	  Searchbox.sendKeys(Keys.ENTER);
//  
//	  driver.get("https://the-internet.herokuapp.com/login");
	
	  driver.navigate().to("https://the-internet.herokuapp.com/login");
//	  WebElement name = driver.findElement(By.id("username"));			// Always unique value-- more efficient
	  WebElement name = driver.findElement(By.xpath("//input[@type='text' and @id='username']"));		// combination used - and- both conditions should be true
	  name.sendKeys("tomsmith");
	  
//	  WebElement pwd= driver.findElement(By.name("password"));
	  WebElement pwd= driver.findElement(By.xpath("//input[@name='password' or @id='password']"));		// combination used - or - either one condition should be true
	  pwd.sendKeys("SuperSecretPassword!");
	  
//	  WebElement btnLogin= driver.findElement(By.className("radius"));	
//	  WebElement btnLogin= driver.findElement(By.tagName("button"));		// HTML tag name is used-- can be multiple elements 
	  WebElement btnLogin= driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
	  btnLogin.click();
	  
//	  // navigate methods can also be used to open and navigate in application
//	  driver.navigate().back();
//	  System.out.println(driver.getTitle());
//	  System.out.println(driver.getCurrentUrl());
//	  driver.navigate().forward();
	  
//	  driver.findElement(By.linkText("Elemental Selenium")).click();	// for static link text where entire text string is known
	  driver.findElement(By.partialLinkText("Elemental")).click();		// for dyanamic link text where text might change
	  
  }
}
