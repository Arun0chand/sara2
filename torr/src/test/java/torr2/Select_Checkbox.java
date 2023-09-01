package torr2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Checkbox {
	
	public static void main(String args[]) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		 js1.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
		
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total number of check boxes"+checkbox.size());
		Thread.sleep(2000);
//		int cbox=checkbox.size();
		for(WebElement ckb: checkbox) {
	     String checkboxselect=ckb.getAttribute("id");
	     if(checkboxselect.equals("tuesday")|| checkboxselect.equals("saturday") || checkboxselect.equals("checkboxselect")) {
	    	 
	    	 ckb.click();
	     }
			
		}
		
		
		
//		for(int i=0; i<cbox;i++) {
//			
//			if(i<4) {
//				
//				checkbox.get(i).click();
//			}
		
//		driver.findElement(By.xpath("//input[@type='radio' and @id='1year']")).click();
			
		}
		
	
//				
//			}
//		}
		
		
		
		
		
		
		
		}	

	


