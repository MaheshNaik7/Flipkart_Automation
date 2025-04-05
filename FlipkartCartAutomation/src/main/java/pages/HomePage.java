
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    By closeLoginPopup = By.xpath("//button[contains(text(),'✕')]");
    By searchBox = By.name("q");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeLoginPopup() {
        try {
            WebElement closeBtn = driver.findElement(closeLoginPopup);
            closeBtn.click();
        } catch (Exception e) {
            // Popup not shown
        }
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName + Keys.ENTER);
    }
}
