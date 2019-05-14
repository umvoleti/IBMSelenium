package seleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Program Files/geckodriver-v0.24.0-win64/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.facebook.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@name='email']")).sendKeys("vanivoleti@gmail.com");
		 System.out.println(driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::tr//preceding-sibling::tr//td/label")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@name='email']//ancestor::tr//preceding-sibling::tr//td[2]//label")).getText());
		 System.out.println(driver.findElement(By.xpath("//*[@name='email']//parent::td//parent::td/following-sibling::/td/input[@name='pass']")).getText());
			
	}

}
