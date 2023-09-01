package torr;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Iterator; 
import java.util.Set; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest { 
public static void main(String[] args) throws InterruptedException, AWTException { 
WebDriver driver=new ChromeDriver(); driver.get("Webpage link"); 
driver.manage().window().maximize(); 
Thread.sleep(2000);
driver.findElement(By.id("PopUp")).click(); // Clicking on the popup button
Robot robot = new Robot();
robot.mouseMove((int) 400.5, 0);// Navigating through mouse hover. Note that the coordinates might differ, kindly check the coordinates of x and y axis and update it accordingly.
robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
robot.mouseMove(0, 0);
Thread.sleep(2000);
robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
Thread.sleep(2000);
driver.quit();
}
}