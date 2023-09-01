package torr;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Take_Screenshot {
	
	public static void main(String args[]) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");//lauching the url
		
		driver.manage().window().maximize();
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement banner=driver.findElement(By.xpath("(//a[@style='display: block;'])[1]"));
		File src=banner.getScreenshotAs(OutputType.FILE);
		File trg=new File("/home/active38/eclipse-workspace/torr/Screen_shot/demo2.png");
		FileUtils.copyFile(src, trg);
		System.out.println(src);
		
		
		
		
		
		
	}
}


