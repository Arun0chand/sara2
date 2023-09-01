package torr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptscreenShot {
	
	
		
		
		@Test
		
		public static  void drawborder(WebElement element,WebDriver driver) {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].style.border='5px solid red'",element);
		}
		
		@Test
		public  void javaBorder() {
			
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			WebElement border= driver.findElement(By.xpath("(//a[text()='Digital downloads '])[1]"));
			drawborder(border, driver);
			System.out.println(border);
			
		}
			
		
	
		
		
	}



