package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationPracticePage {
  @Test
  public void practice() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  List <WebElement> items = driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td"));		// syntax : // TagName[Contains(text(), 'text to check')]	it can be partial text
	  System.out.println("Details of a book....");
	  for (WebElement item:items) {
		  System.out.println(item.getText());
	  }
	  WebElement Animesh = driver.findElement(By.xpath("//td[text()='Animesh']//following-sibling::td[1]"));						// syntax : // TagName[(text()= 'text to check']	exact text has to be given in value
	  System.out.println("The Subject selected by Animesh is "+Animesh.getText());
	  
	  
	  // Select a book whose price is 2000
	  WebElement book = driver.findElement(By.xpath("//td[contains(text(),'2000')]//preceding-sibling::td[3]"));						// syntax : // TagName[(text()= 'text to check']	exact text has to be given in value
	  System.out.println("The book with price equal to 2000 is "+book.getText());
	  System.out.println("The book with price equal to 2000 is displayed");
	  System.out.println("Change is added from GitHub Remote");
	  driver.quit();
  
  
  
  
  }	
}
