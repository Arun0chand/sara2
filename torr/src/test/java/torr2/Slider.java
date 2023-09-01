package torr2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	
	
public static void main(String args[]) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.se
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.globalsqa.com/demo-site/sliders/");
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    WebElement enterframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	    driver.switchTo().frame(enterframe);
	    WebElement sliderred=driver.findElement(By.xpath("(//span[@tabindex='0'])[2]"));
	   
	    Actions act1=new Actions(driver);
	    act1.dragAndDropBy(sliderred, -156, 13).build().perform();
	    System.out.println(("Location of the element:"+sliderred.getLocation()));
	    System.out.println(("Location of the element:"+sliderred.getText()));
	    System.out.println(("Location of the element:"+sliderred.getSize()));
	    
	    

}
}
