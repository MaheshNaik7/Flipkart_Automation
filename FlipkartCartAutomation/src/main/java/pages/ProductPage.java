
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ProductPage {
    WebDriver driver;

    By addToCartButton = By.xpath("//button[text()='Add to cart']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToProductTab() {
        String mainWindow = driver.getWindowHandle();
        Set<String> allTabs = driver.getWindowHandles();
        for (String handle : allTabs) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(3000); // wait for add to cart button to be clickable
        driver.findElement(addToCartButton).click();
    }
}
