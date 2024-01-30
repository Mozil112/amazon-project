package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    private By searchField = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    public void searchProduct(String productName) {
        Common.waitForElement(driver.findElement(searchField));
        driver.findElement(searchField).sendKeys(productName);
        driver.findElement(searchButton).click();
    }
}
