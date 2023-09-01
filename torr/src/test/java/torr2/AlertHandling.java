package torr2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	/*	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
	  Alert alerthadle=driver.switchTo().alert();
	  Thread.sleep(1000);
	  alerthadle.sendKeys("Hello world");
	  alerthadle.accept();*/
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.get("https://www.google.com/");
		WebElement fr1=driver.findElement(By.xpath("//iframe[@name='callout']"));
		driver.switchTo().frame(fr1);
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Class classname=driver.findElement(By.xpath("//a[text()='Sign in']")).c
		System.out.println("Print the classname of the element :"+classname.getClass());
	}
}
