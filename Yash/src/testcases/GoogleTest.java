package testcases;

import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public static void Googletest() {
		
		WebDriver driver = newFirefoxDriver();
		//it will open the goggle page
		driver.get("http://google.in");
		//we expect the title “Google “ should be present
		String Expectedtitle = "Google";
		//it will fetch the actual title
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		Assert.assertEquals(Actualtitle, Expectedtitle);
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");	
		
		
	}

}
