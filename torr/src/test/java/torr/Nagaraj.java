package torr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nagaraj
{
	WebDriver driver;
@BeforeMethod(alwaysRun =true)
public void settup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
}
@Test(dataProvider ="ab" )
public void login(String mob_num) throws InterruptedException
    {
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(mob_num);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@id='continue']")).click();
    }
@DataProvider(name="ab")
String[][]logindata()
{
	
	
String[][]data=
{
	{"***"},
	{"1234567891"},
	
};	
return data;
}

@AfterMethod
void teardown(){
	driver.quit();
	
}
}








