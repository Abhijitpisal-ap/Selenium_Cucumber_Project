package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LambdaTestPage {
  @Test
  public void lambdatest() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://accounts.lambdatest.com/register");
	  WebElement Email= driver.findElement(By.xpath("//form[@class='form reg-custom']//input[@id='email']"));
	  // // single / anchor tag will give direct child element but if we use // then it will give all child elements matching the anchor tag
	  Email.isDisplayed();
	  
	  driver.navigate().to("https://www.lambdatest.com/blog/");
	  driver.findElement(By.xpath("//div[@class='dropdown rs-dropdown dropdown_blog item_link'][1]")).isEnabled();
	  
	  driver.findElement(By.xpath("//ul[@id='menu-side-menu']//li[starts-with(@id, 'menu-item')]")).isEnabled();		// syntax : //TagName[starts-with(@attrName, 'AttrValue')]
	  
	  driver.findElement(By.xpath("//div[@class='sidebar-inner']//descendant::div[@class='menu-side-menu-container']")).isEnabled();
	  
	  driver.findElement(By.xpath("//li[@id=\"menu-item-43\"]//parent::ul")).isEnabled();
	  driver.findElement(By.xpath("//li[@id=\"menu-item-43\"]//child::a")).isEnabled();
	  
	
	driver.quit();
	  
  }
}
