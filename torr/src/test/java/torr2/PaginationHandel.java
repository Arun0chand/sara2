package torr2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationHandel {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com/search");

        // Pagination loop - Change the limit as needed
        int currentPage = 1;
        int totalPages = 10; // Set the total number of pages you want to navigate

        while (currentPage <= totalPages) {
            // Process data on the current page (or any other actions)
            processPageData(driver);

            // Click on the "Next Page" element to navigate to the next page
            WebElement nextPageElement = driver.findElement(By.xpath("//a[contains(@class, 'next-page')]"));

            // Check if the "Next Page" element is present and enabled
            if (nextPageElement.isDisplayed() && nextPageElement.isEnabled()) {
                nextPageElement.click();
                currentPage++;
            } else {
                // If the "Next Page" element is not present or disabled, break the loop
                break;
            }
        }

        driver.quit();
    }

    private static void processPageData(WebDriver driver) {
        // Implement your data processing logic for each page here
        // For example, extract data or perform actions on elements
        // You can also use explicit waits to ensure elements are present before interacting with them
        // ...
    }
}