package torr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base1  {
	WebDriver driver;

	
	@BeforeTest
	 public void setup() throws Exception {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
	  
	  
	  

}
	
	void nothing() {
		System.out.println("Print the base class 1");
			
		
	}
}
