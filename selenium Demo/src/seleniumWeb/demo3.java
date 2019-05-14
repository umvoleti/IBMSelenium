package seleniumWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:/Program Files/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
        driver.get("https://opensource-demo.orangehrmlive.com/"); 
        driver.manage().window().maximize(); 
        String ExpectedTittle = "OrangeHRM" ;
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson"); 
        String Value=driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("value");
        System.out.println(Value);
        driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
        driver.findElement(By.cssSelector("input#btnLogin")).click(); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains (text(),'Performance')]")).click();
        Thread.sleep(2000);
        List<WebElement> links=  driver.findElements(By.tagName("a"));
        for(WebElement e:links){
        	
        	String linktext=e.getText();
        	System.out.println(linktext);
        }
        
        



	}
	

}
