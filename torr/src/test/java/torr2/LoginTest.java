package torr2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        
        driver.get("https://campaignsopend.tech-active.com/#/admin_login");

        LoginPage loginPage = new LoginPage(driver);
       

        loginPage.enterUsername("admin@opend.com");
        loginPage.enterPassword("1234");
        loginPage.clickLoginButton();

        // Assuming successful login, navigate to the home page
        HomePage homePage = new HomePage(driver);

        // Perform actions on the home page
        String welcomeMsg = homePage.getWelcomeMessageText();
        System.out.println("Welcome Message: " + welcomeMsg);
        //Campaign actions on the status
        homePage.clickonCampaign();
        Thread.sleep(1000);
        homePage.dropdownStatus();
        Thread.sleep(2000);
        homePage.closeButton();

//        driver.quit();
    }
}
