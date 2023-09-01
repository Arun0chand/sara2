package torr2;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ContactUploadMain {
public WebDriver driver;
@BeforeClass
public void Beforeclass() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
//driver.get("https://www.foundit.in/");
driver.get("https://www.google.com/maps/about/mymaps/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
}
@Test
public void Map() throws InterruptedException {
driver.findElement(By.xpath("//a[.='Get started']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("arun@active.agency");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Arunpaddu$2");
Thread.sleep(1000);
driver.findElement(By.xpath("//span[.='Next']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//span[.='+ Create a new map'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[.='Import'])[1]")).click();
Thread.sleep(1000);
java.util.Set<String> Pid = driver.getWindowHandles();
for(String Cid : Pid) {
driver.switchTo().window(Cid);
}
WebElement path = driver.findElement(By.xpath("//span[.='Browse']"));
path.sendKeys("/home/active34/eclipse-workspace/Opend_01/src/test/resources/TestData/Data_Opend.csv");
Thread.sleep(2000);
}
@AfterClass
public void End() {
    driver.close();
}
}
