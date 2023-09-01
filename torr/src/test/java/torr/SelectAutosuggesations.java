package torr;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAutosuggesations {
    public static void main(String[] args) {
       WebDriver driver;
    	WebDriverManager.chromedriver().setup();
    	driver= new ChromeDriver();
    	driver.get("https://www.google.com");
    	driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        searchBox.sendKeys("facebook");
        sleep(2000); 

        
        for (int i = 1; i <= 4; i++) {
            searchBox.sendKeys(Keys.ARROW_DOWN);
            sleep(1000); 
        }
        searchBox.sendKeys(Keys.ENTER);

       
        sleep(5000);

        
        driver.quit();
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

