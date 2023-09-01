package torr;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Contact_Script {
	WebDriver driver;

	
	@BeforeClass
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));

		// login
		// ****************************************************************************
		driver.get("http://campaignsopend.tech-active.com/#/admin_login");
		WebElement emailTextField = driver.findElement(By.id("email_id"));
		emailTextField.clear();
		emailTextField.sendKeys("admin@opend.com");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Sign In']")).submit();
	}
	
	// Filtering xpath
	
	By admin_contact = By.xpath("//li[@class='contact-menu removeLSB']");
	By search_contact = By.xpath("//input[@placeholder='Search Contacts']");
	By Status_Contact = By.xpath("//select[@ng-model='status_search']");
	By PB_list = By.xpath("//select[@id='publisher_list']");
	By verify_PB = By.xpath("(//span[@class='camp-list-body ng-binding'])[2]");
	By reset_btn = By.xpath("//button[.='Reset']");
	
	// create a contact xpath
	
	By create_contact = By.xpath("//a[@class='crt_camp_btn change-btn-width']");
	By publisher_drop = By.xpath("(//select[@ng-model='publisher_select'])[1]");
	By contact_name = By.xpath("//input[@ng-model='list_name']");
	By AT_name = By.xpath("//input[@ng-click='open_audience_type();']");
	By search_bar_01 = By.xpath("//input[@ng-model='searchTypeMultiSelect']");
	By select_uk_consumer = By.xpath("//label[.='UK Consumer Data']");
	By select_btn_01 = By.xpath("(//button[.='Select'])[2]");
	By CPM_Payout_price = By.xpath("//input[@ng-model='cpm_payout_price']");
	By usage_limit = By.xpath("//input[@ng-model='usage_limit']");
	By Sub_camp_category = By.xpath("//input[@ng-model='selectedValue']");
	By search_bar_02 = By.xpath("//input[@ng-model='searchTextMultiSelect']");
	By select_automotive = By.xpath("//label[.='Automotive']");
	By select_btn_02 = By.xpath("(//button[.='Select'])[1]");
	By country_drop = By.xpath("/html/body/div[1]/div/div/div/form/div[1]/div[2]/div/div[2]/div[7]/select");
	By upload = By.id("uploadFile");
	By Default_name = By.xpath("//input[@ng-model='contacts_from_name']");
	By add_contact = By.xpath("//button[.='Add']");
	
	
	// Data mapping xpath
	
		By first_name = By.xpath("//select[@ng-model='first_name']");
		By sur_name = By.xpath("//select[@ng-model='surname']");
		By email_ID = By.xpath("//select[@ng-model='email']");
		By salu_tation = By.xpath("//select[@ng-model='salutation']");
		By IP_address = By.xpath("//select[@ng-model='ip_address']");
		By Birth = By.xpath("//select[@ng-model='dob']");
		By post_code = By.xpath("//select[@ng-model='postalcode']");
		By gen_der = By.xpath("//select[@ng-model='gender']");
		By loc_ation = By.xpath("//select[@ng-model='location']");
		By Source = By.xpath("//select[@ng-model='optinsrc']");
		By date = By.xpath("//select[@ng-model='optindate']");
		By time = By.xpath("//select[@ng-model='optintime']");
		By add_btn = By.xpath("//button[.='add']");
	
	@Test
	public void Opendcontact() throws InterruptedException {
		
		// By using filter , search and status a contact and publisher
		
		driver.findElement(admin_contact).click();
		Thread.sleep(2000);
		driver.findElement(search_contact).sendKeys("API");
		Thread.sleep(2000);
		WebElement status = driver.findElement(Status_Contact);
		Select sel_01 = new Select(status);
		sel_01.selectByVisibleText("Active");
		Thread.sleep(2000);
		WebElement PB_drop = driver.findElement(PB_list);
		Select sel_02 =new Select(PB_drop);
		sel_02.selectByVisibleText("Myntra (sandeep@active.agency)");
		Thread.sleep(2000);
		boolean PB_Name = driver.findElement(verify_PB).isDisplayed();
		Assert.assertTrue(PB_Name);
		System.out.println("PB_Name "+PB_Name);
		Thread.sleep(2000);
		driver.findElement(reset_btn).click();
		
		// create a contact ....
		
		
		driver.findElement(create_contact).click();
		Thread.sleep(2000);
		WebElement PB_name_drop = driver.findElement(publisher_drop);
		Select sel_03 = new Select(PB_name_drop);
		sel_03.selectByVisibleText("Myntra (sandeep@active.agency)");
		Thread.sleep(2000);
		driver.findElement(contact_name).sendKeys("Test_Elastic");
		Thread.sleep(2000);
		driver.findElement(AT_name).click();
		Thread.sleep(2000);
		Set<String> Pid = driver.getWindowHandles();
		for(String Cid : Pid) {
			driver.switchTo().window(Cid);
		}
		driver.findElement(search_bar_01);
		Thread.sleep(2000);
		driver.findElement(select_uk_consumer).click();
		Thread.sleep(2000);
		driver.findElement(select_btn_01).click();
		Thread.sleep(2000);
		JavascriptExecutor js_01 = (JavascriptExecutor) driver;
		js_01.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(CPM_Payout_price).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(usage_limit).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(Sub_camp_category).click();
		Thread.sleep(2000);
		Set<String> pid_01 = driver.getWindowHandles();
		for(String Cid_01 : pid_01) {
			driver.switchTo().window(Cid_01);
		}
		driver.findElement(search_bar_02).sendKeys("AU");
		Thread.sleep(2000);
		driver.findElement(select_automotive).click();
		Thread.sleep(2000);
		driver.findElement(select_btn_02).click();
		Thread.sleep(2000);
		WebElement drop = driver.findElement(country_drop);
		Thread.sleep(2000);
		Select sel_04 = new Select(drop);
		sel_04.selectByValue("79");
		Thread.sleep(2000);
//		JavascriptExecutor js_02 = (JavascriptExecutor) driver;
//		js_01.executeScript("window.scrollBy(0,200)");
//		Thread.sleep(2000);
		WebElement upload_file = driver.findElement(upload);
		upload_file.sendKeys("/home/active34/Documents/B2C Contact LIst/B2C folder/CTest02_B2C_250.csv");
		Thread.sleep(2000);
		driver.findElement(Default_name).sendKeys("Test Mails");
		Thread.sleep(2000);
//		JavascriptExecutor js_03 = (JavascriptExecutor) driver;
//		js_01.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
		boolean get_text = driver.findElement(add_contact).isDisplayed();
		Assert.assertTrue(get_text);
		System.out.println(get_text);
		Thread.sleep(2000);
		driver.findElement(add_contact).click();
		
		// Data mapping
		
				WebElement firstname = driver.findElement(first_name);
				Select sel1 = new Select(firstname);
				sel1.selectByVisibleText("First Name");
				Thread.sleep(2000);
				WebElement surname = driver.findElement(sur_name);
				Select sel2 = new Select(surname);
				sel2.selectByVisibleText("Sur Name");
				Thread.sleep(2000);
				WebElement ID_email = driver.findElement(email_ID);
				Select sel3 = new Select(ID_email);
				sel3.selectByVisibleText("Email");
				Thread.sleep(2000);
				WebElement salutation_ID = driver.findElement(salu_tation);
				Select sel4 = new Select(salutation_ID);
				sel4.selectByVisibleText("salutation");
				Thread.sleep(2000);
				WebElement Address = driver.findElement(IP_address);
				Select sel5 = new Select(Address);
				sel5.selectByVisibleText("ipaddress");
				Thread.sleep(2000);
				WebElement Date_of_Birth = driver.findElement(Birth);
				Select sel6 = new Select(Date_of_Birth);
				sel6.selectByVisibleText("dob");
				Thread.sleep(2000);
				WebElement Postal_code = driver.findElement(post_code);
				Select  sel7 = new Select(Postal_code);
				sel7.selectByVisibleText("post code");
				Thread.sleep(2000);
				WebElement Genndder = driver.findElement(gen_der);
				Select sel8 = new Select(Genndder);
				sel8.selectByVisibleText("gender");
				Thread.sleep(1000);
				WebElement locate = driver.findElement(loc_ation);
				Select sel9 = new Select(locate);
				sel9.selectByVisibleText("country");
				Thread.sleep(1000);
				WebElement Opt_in_source = driver.findElement(Source);
				Select sel10 = new Select(Opt_in_source);
				sel10.selectByVisibleText("optinsource");
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(1000);
				WebElement opt_in_date = driver.findElement(date);
				Select sel11 = new Select(opt_in_date);
				sel11.selectByVisibleText("optindate");
				Thread.sleep(1000);
				WebElement opt_in_time = driver.findElement(time);
				Select sel12 = new Select(opt_in_time);
				sel12.selectByVisibleText("optintime");
				Thread.sleep(1000);
				//driver.findElement(add_btn).click();
				
			}
		
	
	@AfterClass
	public void end() {
		driver.close();
	}
	
}
		
			
		// Click on the start new campaign button