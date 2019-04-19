package siri;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Test
public class Webdriver_class {
	
	
	//Run yout First Selenium WebDriver script by copy paste below code after executing above five simple steps	 
	
	{
		
    System.setProperty("webdriver.chrome.driver", "C:\\dev files\\drivers\\chromedriver.exe");		
	WebDriver driver =new ChromeDriver ();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	driver.close();
	}
	

	
}
