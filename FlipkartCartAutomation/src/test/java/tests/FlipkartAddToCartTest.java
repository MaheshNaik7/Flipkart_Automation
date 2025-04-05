
package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;

public class FlipkartAddToCartTest extends BaseTest {

    @Test
    public void testAddToCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();
        homePage.searchProduct("iPhone 14");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.selectFirstProduct();

        ProductPage productPage = new ProductPage(driver);
        productPage.switchToProductTab();
        productPage.addToCart();
    }
}
