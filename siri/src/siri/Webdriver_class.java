package siri;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Webdriver_class {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Run yout First Selenium WebDriver script by copy paste below code after executing above five simple steps
		 
		 
		class Webdriver_class
		{
		public static void main(String[] args)
		{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		}
		}

	}

}
