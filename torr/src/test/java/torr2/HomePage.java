package torr2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//h1[text()='Administrator Console ']")
    private WebElement welcomeMessage;
    
    @FindBy(xpath="//li[@class='campaigns-menu removeLSB']")
    private WebElement campaignClick;
    
    @FindBy(xpath="//select[@ng-model='campaign_status']")
    private WebElement drpStatus;
    
    @FindBy(xpath="//li[@class='dropdown-profile']")
    private WebElement closebutton;
    @FindBy(xpath="//a[text()='Logout']")
    private WebElement close;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getWelcomeMessageText() {
        return welcomeMessage.getText();
    }
    
    public void clickonCampaign() {
    	campaignClick.click();
    }
    
    public void dropdownStatus() {
    Select drpStatus1=new Select(drpStatus);
    drpStatus1.selectByVisibleText("Ongoing");}
    
    public void closeButton() {
    	
    	Actions act=new Actions(driver);
    	act.moveToElement(closebutton).build().perform();
    	close.click();
    	
    	
    }
    
    
    }


		
	





