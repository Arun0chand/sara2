package torr2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluintWait {
	
	
	public static void main(String args[]) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("abcd alphabet");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
		
		 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	                .withTimeout(Duration.ofSeconds(30)) // Maximum wait time
	                .pollingEvery(Duration.ofSeconds(2)) // Check for the element every 2 seconds
	                .ignoring(org.openqa.selenium.NoSuchElementException.class);

	        // Define the custom condition
	        WebElement element = fluentWait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(By.id("//h3[text()='Read and Write The Alphabet ABCD in English']")); // Replace "elementId" with the ID of the element you want to wait for
	            }
	        });

	        // Once the element is found, you can perform actions on it
	        element.click();

	        // Remember to close the browser at the end of the test
	        driver.quit();
	    }
				
			
				
		
	}


