package torr;


import org.testng.annotations.Test;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class window_popup  extends Basic{
	
	@Test
	public void Camp() throws InterruptedException {
		
		driver.findElement(By.xpath("//li[@class='campaigns-recurring-menu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.=' Start New Campaign']")).click();
		Thread.sleep(3000);
		Select sel = new Select(driver.findElement(By.xpath("//select[@ng-model='advertiser_select']")));
		sel.selectByVisibleText("Known Ltd (lukefairbrass36@hotmail.com)");
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		//for(int i=1; i<=1; i++) {
			js1.executeScript("window.scrollBy(0,100)");
			Thread.sleep(3000);
	//	}
		driver.findElement(By.xpath("(//input[@placeholder='Max 100 Characters'])[1]")).sendKeys("Test campaign");
		Select sel1 = new Select(driver.findElement(By.xpath("(//select[@ng-model='campaign_group'])[1]")));
		sel1.selectByVisibleText("Default");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[.='Free'])[1]")).click();
		Select sel2 = new Select(driver.findElement(By.xpath("(//select[@ng-model='country_iso'])[1]")));
		sel2.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		Select sel3 = new Select(driver.findElement(By.xpath("(//select[@ng-model='audience_type'])[1]")));
		sel3.selectByVisibleText("UK Consumer Data");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@ng-model='audience_category_text'])[1]")).click();
		Thread.sleep(2000);
		
		 String MainWindow = driver.getWindowHandle();
		 System.out.println("Main window handle is " + MainWindow);
		 
		Set<String> pid = driver.getWindowHandles();
		for(String id : pid) {
		driver.switchTo().window(id);
		System.out.println("Child window hadle is"+id);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//for(int i=1; i<=1; i++) {
			js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(3000);
		//}
		}
		driver.findElement(By.xpath("//label[.='Travel & Hospitality']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Select'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@ng-model='functionalareaText'])[1]")).click();
		Thread.sleep(2000);
		
		String MainWindow2 = driver.getWindowHandle();
		System.out.println("Main window handle is " + MainWindow2);
		
		Set<String> pid1 = driver.getWindowHandles();
		System.out.println("Total Windows: " + pid1.size());
		for(String id1 : pid1) {
		driver.switchTo().window(id1);
		System.out.println("Child window hadle is"+id1);
		Thread.sleep(3000);
		}
		driver.findElement(By.xpath("(//label[.='Travel & Hospitality'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Select'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model='publisherText']")).click();
		Thread.sleep(2000);
		Set<String> pid2 = driver.getWindowHandles();
		System.out.println("Total Windows: " + pid2.size());
		for(String id2 : pid2) {
		driver.switchTo().window(id2);
		Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		//for(int i=1; i<=1; i++) {
			js2.executeScript("window.scrollBy(0,100)");
			Thread.sleep(3000);
	//	}
		}
		driver.findElement(By.xpath("//label[.='Flipkart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Select'])[3]")).click();
	}
}