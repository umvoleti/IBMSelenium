package seleniumWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:/Program Files/geckodriver-v0.24.0-win64/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://realestate.upskills.in/wp-admin/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("user_login")).sendKeys("admin");
		 driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		 driver.findElement(By.name("login")).click();
		 WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy']"));
		 Actions act = new Actions(driver);
	     act.contextClick(link).build().perform();
	     Robot robot = new Robot();
	     robot.keyPress(KeyEvent.VK_DOWN);
	     Thread.sleep(2000);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     Thread.sleep(2000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     Thread.sleep(2000);
	     robot.keyPress(KeyEvent.VK_TAB);
	     System.out.println(driver.getCurrentUrl());
	     
	     
	     
	        
	        
		 
		 

	}

}
