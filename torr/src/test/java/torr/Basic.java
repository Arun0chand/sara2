package torr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {
	WebDriver driver;
	@BeforeClass
	public void Open() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://campaignsopend.tech-active.com/#/admin_login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@opend.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[.='Sign In']")).click();
	Thread.sleep(2000);
	}
	
	@AfterClass
	public void end() {
	driver.close();
	}

}
