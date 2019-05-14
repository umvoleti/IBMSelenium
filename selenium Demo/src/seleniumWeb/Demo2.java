package seleniumWeb;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo2 {
	private static final String WebElement = null;

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver","C:/Program Files/geckodriver-v0.24.0-win64/geckodriver.exe");
	WebDriver driver = new FirefoxDriver(); 
    driver.get("http://newtours.demoaut.com/"); 
    Thread.sleep(3000);

    driver.manage().window().maximize(); 

    driver.findElement(By.name("userName")).sendKeys("sunil"); 
    driver.findElement(By.name("password")).sendKeys("sunil"); 
    driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click(); 
    Thread.sleep(3000);

    if (driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected()) 

    { 
    	driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click(); 
        WebElement dd =driver.findElement(By.name("passCount"));
        Select se1=new Select(dd);
        
        List<WebElement> data=se1.getOptions();
        
        
        System.out.println(data.size());
      for(int i=0; i<data.size();i++) {
    	  System.out.println(data.get(i));
    	  se1.selectByValue("2");
    	  
      }
      }
        
        
    }
	
	
	
	}


