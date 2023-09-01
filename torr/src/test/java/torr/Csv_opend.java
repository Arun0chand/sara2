package torr;



import java.awt.Robot;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Csv_opend {

	//Provide CSV file path. It Is In D: Drive.
	String CSV_PATH="/home/active38/eclipse-workspace/torr/src/test/resources/opend_login.csv";
	WebDriver driver;


	@BeforeTest
	public void setup() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://campaignsopend.tech-active.com/#/admin_login");
	}

	@Test
	public void csvDataRead() throws IOException, CsvValidationException, InterruptedException{

		CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
		String [] csvCell;
		//while loop will be executed till the last line In CSV.
		while ((csvCell = reader.readNext()) != null) {   
			String Username = csvCell[0];
			String Password = csvCell[1];
			try {
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Username);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[.='Sign In']")).click();



				Thread.sleep(2000);
				if (driver.getCurrentUrl().equals("https://campaignsopend.tech-active.com/#/admin-dashboard/users")) {
					System.out.println("Login successful");
				} else {
					System.out.println("Login failed");
				}
				Actions act = new Actions(driver);
				WebElement move = driver.findElement(By.xpath("(//span[.='AO'])[1]"));
				act.moveToElement(move).perform();
				driver.findElement(By.xpath("//a[.='Logout']")).click();
				String errormessage=driver.findElement(By.className("abc")).getText();
						
				Assert.assertEquals(errormessage,"Message is not displayed");
				WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		        searchBox.sendKeys("facebook");
		        for(int i=0;i<=4; i++) {
		        searchBox.sendKeys(Keys.ARROW_DOWN);
		        }

			}//try block completed

			catch (NoSuchElementException e) {    // catch block started
				
				System.out.println("One or more elements not found: " + e.getMessage());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			Thread.sleep(6000);
			//			driver.quit();


		}
	}

	@AfterClass
	public void end() {
		driver.close();
	}
}
