package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Base extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		
	}
	
}
