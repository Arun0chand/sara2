package torr2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
	public WebDriver driver;
    WebDriver wait;


	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cp);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));

		// login
		// ****************************************************************************
		driver.get("http://campaignsopend.tech-active.com/#/admin_login");
		WebElement emailTextField = driver.findElement(By.id("email_id"));
		emailTextField.clear();
		emailTextField.sendKeys("admin@opend.com");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Sign In']")).submit();

		// ******************************************************************************
		//Click on the campaign
		

		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/aside[1]/ul[1]/li[2]/a[1]")).click();
		// Click on the start new campaign button
	}
	@Test
	public void pageTest() {
		
		int currentPage = 1;
		int totalPages = 100;
		
		try {
			
			WebElement drp=driver.findElement(By.xpath("//select[@ng-model='campaign_status']"));
			Thread.sleep(2000);
			Select st=new Select(drp);
			Thread.sleep(2000);
			st.selectByVisibleText("Ongoing");
			JavascriptExecutor js5 = (JavascriptExecutor) driver;
			Thread.sleep(2000);
			js5.executeScript("window.scrollBy(0,1530)");
			Thread.sleep(2000);
			
			while(currentPage<=totalPages) {
				
				WebElement nextPage=driver.findElement(By.xpath("//span[text()='Last']"));
				Thread.sleep(2000);
				if(nextPage.isDisplayed()) {
					nextPage.click();
					currentPage++;
					
					Thread.sleep(2000);
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
					Thread.sleep(1000);
//                    wait.until(ExpectedConditions.stalenessOf(nextPage));
                    Thread.sleep(1000);
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ng-binding ng-scope active']"))); 
                } else {
                    // If the "Next Page" element is not present or disabled, break the loop
                	
                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException occurred. Pagination stopped.");
        } catch (TimeoutException e) {
            System.out.println("TimeoutException occurred while waiting for pagination element. Pagination stopped.");
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred. Pagination stopped. Error: " + e.getMessage());
        } 
    }

    
   
}






				
			
		


	







