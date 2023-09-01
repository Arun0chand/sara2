package torr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowElement {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver;
    	WebDriverManager.chromedriver().setup();
    	 ChromeOptions options = new ChromeOptions();

         // Set desired capabilities
         options.addArguments("--start-maximized"); // Maximize the browser window
         options.addArguments("--disable-notifications"); // Disable browser notifications
         options.addArguments("--incognito"); // Launch Chrome in incognito mode
    	driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://selectorshub.com/xpath-practice-page/");
    	
//    	driver.switchTo().frame(0);
    	
    	
    	
//    	driver.switchTo().frame("oneGoogleBar");
//    	driver.switchTo().frame("iframe");
    	JavascriptExecutor js1=(JavascriptExecutor)driver;
    	 js1.executeScript("window.scrollBy(0,1500)");
    	 Thread.sleep(2000);
    	WebElement pizza=(WebElement)js1.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
    	Thread.sleep(2000);
    	String js2="arguments[0].setAttribute('value' ,'Paneer pizza')";
    	Thread.sleep(2000);
    	js1.executeScript(js2, pizza);
//    	driver.switchTo().defaultContent();
    	
    	
    	
    }
}

