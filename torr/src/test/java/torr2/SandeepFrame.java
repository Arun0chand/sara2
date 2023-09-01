package torr2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SandeepFrame {
WebDriver driver;
@Test
public void Dragdropfunctionality() throws InterruptedException {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.globalsqa.com/demo-site/tooltip/");
Thread.sleep(2000);
driver.findElement(By.xpath("(//span[.='Drag And Drop'])[2]")).click();


WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
driver.switchTo().frame(frame1);
//driver.switchTo().frame(5);
Actions act = new Actions(driver);
WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
//Thread.sleep(1000);
act.dragAndDrop(drag, drop).perform();
int size = driver.findElements(By.tagName("iframe")).size();
System.out.println("Size"+size);
Thread.sleep(2000);
//driver.close();*/
}
}