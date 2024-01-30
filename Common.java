package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void waitForElement(WebElement element) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void takeScreenshot(String screenshotName) {
        // Code to take screenshot and save it with the specified name
    }
}
