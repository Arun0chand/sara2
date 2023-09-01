package torr2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	
	
	public static void main(String args[]) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	  
	    driver.switchTo().frame(4);
	    Actions act=new Actions(driver);
		Thread.sleep(1000);
		WebElement right1=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[3]"));
		Thread.sleep(1000);
		WebElement right=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Thread.sleep(1000);
		act.dragAndDrop(right1, right).build().perform();
		
	}

}
