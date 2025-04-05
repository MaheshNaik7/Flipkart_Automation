
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    WebDriver driver;

    By firstProduct = By.cssSelector("._1fQZEK, ._4ddWXP");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstProduct() {
        driver.findElement(firstProduct).click();
    }
}
