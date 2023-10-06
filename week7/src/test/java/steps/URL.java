package steps;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v116.browser.Browser;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class URL 
{
	
	WebDriver driver;
	@Given("I hit the url")
	public void i_hit_the_url() {
		ChromeOptions opt= new ChromeOptions();
		opt.addExtensions(new File("./Extensions/ad-blocker.crx"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(opt); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window).close();
		
		}
		}
		driver.switchTo().window(parent);
		//driver.get("https://automationexercise.com/");
		
		driver.navigate().refresh();
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		
	}
}
