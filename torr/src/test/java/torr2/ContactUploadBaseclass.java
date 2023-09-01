package torr2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.zeromq.ZStar.Set;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ContactUploadBaseclass {
public WebDriver driver;
@BeforeClass
public void Beforeclass() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.foundit.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
}
@AfterClass
public void End() {
    driver.close();
}
}










