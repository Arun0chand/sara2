package torr2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	static WebDriver driver;
	
	
	public static void main(String args[]) {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		}
		@Test
		
		public void getTest(WebDriver driver) {
			
		WebElement allele=driver.findElement(By.tagName("Select"));
		generalMethod(allele,"Angola");
	}
		
		public  void generalMethod(WebElement ele,String value) {
			
			
			Select drp=new Select(ele);
			List<WebElement>drop=drp.getOptions();
			
			for(WebElement drp2:drop) {
				if(drp2.getText().equals(value)) {
					
					drp2.click();
					break;
				}
				
			}
			
		}
			
		}
		





//