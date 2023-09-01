package torr2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {
	
	
	@Test
	
	public static void manageCookies() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));

//		// login
//		// ****************************************************************************
//		driver.get("http://campaignsopend.tech-active.com/#/admin_login");
//		WebElement emailTextField = driver.findElement(By.id("email_id"));
//		emailTextField.clear();
//		emailTextField.sendKeys("admin@opend.com");
//		WebElement passwordTextField = driver.findElement(By.id("password"));
//		passwordTextField.clear();
//		passwordTextField.sendKeys("1234");
//		driver.findElement(By.xpath("//button[text()='Sign In']")).submit();
//		
		driver.get("https://www.amazon.in/");
		
	Set<Cookie> cookies	=driver.manage().getCookies();
	System.out.println("Cookies size:"+cookies.size());
	
	
	for(Cookie cookie:cookies) {
		
		System.out.println("print the value of cookies:"+cookie.getName()+   "and it's value"   +cookie.getValue());
	}
		
		

	

	}
}
