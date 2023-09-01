package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReturnType 
{

	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	}
	
	@Test
	public String getTitle()
	{
		return driver.getTitle(); 
	}
	
	@Test
	public  String getcurrentURL()
	{
		return driver.getCurrentUrl();
	}

	
	
	
}
