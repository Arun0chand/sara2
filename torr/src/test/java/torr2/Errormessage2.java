package torr2;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Errormessage2 {
	
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://campaignsopend.tech-active.com/#/admin_login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
	}
	
	@AfterClass
	public void TearDown() {
		
		driver.close();
	}
	
	@Test
	public void verifyByValidcredentials() throws InterruptedException {
		
		driver.findElement(By.id("email_id")).sendKeys("admin@opend.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		Thread.sleep(1000);
		String verifybyelement = driver.findElement(By.xpath("//div[@class='nav-title']")).getText();
		System.out.println(verifybyelement);
	}
	
	@Test
	public void verifyByinvalidcredentials() throws InterruptedException {
		
		driver.findElement(By.id("email_id")).sendKeys("admmmmin@opend.com");
		driver.findElement(By.id("password")).sendKeys("1111");
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		Thread.sleep(1000);
		WebElement emailIDfail = driver.findElement(By.xpath("//div[@id='alert_failed']"));
		if(emailIDfail.isDisplayed()) {
			System.out.println("This email id is not registered with us");
		} else {
			System.out.println("This email id is registered");
		}
		String warningmessage = driver.findElement(By.xpath("//div[@id='alert_failed']")).getText();
		System.out.println(warningmessage);
	}
	
	@Test
	public void verifyByvalid_emailID_invalidpassword() throws InterruptedException {
		
		driver.findElement(By.id("email_id")).sendKeys("admin@opend.com");
		driver.findElement(By.id("password")).sendKeys("1231");
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		Thread.sleep(1000);
		boolean invalidcredentials = driver.findElement(By.xpath("//div[@id='alert_failed']")).isDisplayed();
		if(invalidcredentials) {
			System.out.println("Invalid Credentials");
		} else {
			System.out.println("valid credentials");
		}
		String warningmessage = driver.findElement(By.xpath("//div[@id='alert_failed']")).getText();
		System.out.println(warningmessage);
		}
	
	@Test
	public void verifyBywithoutprovidingcredentials() throws InterruptedException {
		
//		driver.findElement(By.id("email_id")).sendKeys("");
//		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//button[.='Sign In']")).click();
		Thread.sleep(1000);
		boolean withoutcredentials = driver.findElement(By.xpath("//div[@id='alert_failed']")).isDisplayed();
		if(withoutcredentials) {
			System.out.println("Please enter a email id and password");
		} else {
			System.out.println("Entered the email id and password");
		}
		String warningmessage = driver.findElement(By.xpath("//div[@id='alert_failed']")).getText();
		System.out.println(warningmessage);
	}
}
