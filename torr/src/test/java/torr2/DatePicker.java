package torr2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	
	@Test
	public void datePicker() {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		
		String year="2023";
		String month="September";
		String date="19";
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		while(true) {
		String monthyear=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'  and @style='flex-grow: 2; font-size: 0.875rem;']")).getText();
		String arr[]=monthyear.split(" ");
		String mon=arr[0];
		String yr=arr[1];
		if(mon.equalsIgnoreCase(month)  && yr.equals(year)) 
			break;
		else {
			driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();}
		
		//Date Selection
		
		List<WebElement>alldates=driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));
		for(WebElement ele:alldates) {
			
			String dt=ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
				
				
			}
		}
		
			
		
		
		
		}
	}
	
}
	
	
	
	
	
	
	
	
	


