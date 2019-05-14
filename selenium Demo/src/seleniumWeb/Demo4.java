package seleniumWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.gecko.driver","C:/Program Files/geckodriver-v0.24.0-win64/geckodriver.exe");
			WebDriver driver = new FirefoxDriver(); 
		    driver.get("http://newtours.demoaut.com/"); 
		    Thread.sleep(3000);

		    driver.manage().window().maximize(); 

		    driver.findElement(By.name("userName")).sendKeys("sunil"); 
		    driver.findElement(By.name("password")).sendKeys("sunil"); 
		    driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click(); 
		    Thread.sleep(3000);
		    
		    List<WebElement> links=  driver.findElements(By.tagName("a"));
	       String[] link=new String[links.size()];
		     int i =0;
		    for(WebElement e:links){
	        	
	        	link[i]=e.getText();
	        	System.out.println(link[i]);
	        	i++;
	        }
		    String underconsTitle="Under Construction: Mercury Tours";
		    for(String t:link){
		    	driver.findElement(By.linkText(t)).click();
		    
				if(driver.getTitle().equals(underconsTitle)){
		    	System.out.println("under contrcution"+t);	
		    	}
		    	
		    	else{
		    		System.out.println("\"" +t+ "\"working");
		    	}
		    	}
		    }
	        
	        
	}


