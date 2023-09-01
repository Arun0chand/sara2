package torr2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tab_Handle {

	WebDriver driver;
	
	@Test
	public void test()
	{
		ChromeOptions options = new ChromeOptions();

        // Disable pop-ups by setting the "disable-popup-blocking" flag to true
        options.addArguments("--disable-popup-blocking");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String tab1=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		String tab2=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		String tab3=driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");
		String tab4=driver.getWindowHandle();
		
		driver.switchTo().window(tab1);
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		
	}
}