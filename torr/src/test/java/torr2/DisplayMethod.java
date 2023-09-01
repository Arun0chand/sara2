package torr2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayMethod {


	@Test



	public static void isDisplaymethod() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url="https://demo.nopcommerce.com/register";
		driver.get(url);
		String strurl=driver.getCurrentUrl();
		System.out.println("CurrentUrl of the page:"+strurl);
		System.out.println("Title of the page:"+driver.getTitle());
		WebElement dis=driver.findElement(By.xpath("//span[@class='male']/input[@type='radio']"));
		System.out.println("Radio button is selected:"+dis.isSelected());
		System.out.println("Radio button is displayes:"+dis.isDisplayed());
		System.out.println("Radio button is Enabled:"+dis.isEnabled());
//		driver.navigate().to("https://demo.nopcommerce.com/electronics");
		
		/*driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
		
		driver.navigate().refresh();
		driver.navigate().back();*/
		



	}

}
