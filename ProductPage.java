package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    private By addToCartButton = By.id("add-to-cart-button");

    public void addProductToCart() {
        Common.waitForElement(driver.findElement(addToCartButton));
        driver.findElement(addToCartButton).click();
    }
}
