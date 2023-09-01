package torr;

import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Base2 extends Base1{
//	WebDriver driver;

	@Test
	public void csvDataRead() throws IOException, CsvValidationException, InterruptedException{
	
		
		String CSV_PATH="/home/active38/eclipse-workspace/torr/src/test/resources/CSVdatatest.csv";
		
		CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
		String [] csvCell;
		nothing();
		//while loop will be executed till the last line In CSV.
		while ((csvCell = reader.readNext()) != null) {   
			String FName = csvCell[0];
			String LName = csvCell[1];
			String Email = csvCell[2];
			String Mob = csvCell[3];
			String company = csvCell[4];
			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(FName);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(LName);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys(Email);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys(Mob);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='Company']")).sendKeys(company);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		}
		
	}
}
