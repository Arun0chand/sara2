package torr2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sandeep2 {
WebDriver driver;
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver;
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://campaignsopend.tech-active.com/#/admin_login");
driver.manage().window().maximize();
// Login Functionality ........
driver.findElement(By.id("email_id")).sendKeys("admin@opend.com");
Thread.sleep(1000);
driver.findElement(By.id("password")).sendKeys("1234");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[text()='Sign In']")).submit();

// Notification Functionality...............
/*WebElement frame1=driver.findElement(By.xpath("//iframe[@title='DashBoard']"));
driver.switchTo().frame(frame1);
driver.findElement(By.xpath("//div[@class='Container']/ul/a[1]")).click();
driver.switchTo().defaultContent();*/
JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,750)");

driver.findElement(By.xpath("//div[@class='notif-options']//button[text()='View All']")).click();
int size = driver.findElements(By.tagName("iframe")).size();
System.out.println("Size="+size);
//driver.close();
}
}