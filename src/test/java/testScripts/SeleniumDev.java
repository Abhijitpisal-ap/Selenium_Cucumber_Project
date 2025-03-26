package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDev {
  @Test
  public void sample() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.selenium.dev/");
	  
	  List <WebElement> items = driver.findElements(By.cssSelector("a.nav-link.dropdown-toggle"));		
	  System.out.println("Dropdowns are...."+items.size());
	  for (WebElement item:items) {
		  System.out.println(item.getText());
	  }
  }
}
