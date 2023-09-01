package torr2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
	WebDriver driver;
	
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=( JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1550)");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register");
		driver.navigate().refresh();
		List<WebElement>footer=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	
//		System.out.println("All the elements present in the footer:"+footer.get(10).getText());
		for(WebElement allele:footer) {
			if(allele.getText().equals("Compare products list"))
				allele.click();
			break;
		}
		
	}

}
