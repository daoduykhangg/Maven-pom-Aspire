package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
    private static LoginPageObject loginPage;
    private static HomePageObject homePage;
    private static ProductPageObject productPage;
    private static ManufacturingOrderPageObject manufacturingOrderPage;

    private PageGeneratorManager() {
    }

    public static LoginPageObject getLoginPage(WebDriver driver) {
        if (loginPage == null) {
            loginPage = new LoginPageObject(driver);
        }
        return loginPage;
    }

    public static HomePageObject getHomePage(WebDriver driver) {
        if (homePage == null) {
            homePage = new HomePageObject(driver);
        }
        return homePage;
    }

    public static ProductPageObject getProductPage(WebDriver driver) {
        if (productPage == null) {
            productPage = new ProductPageObject(driver);
        }
        return productPage;
    }

    public static ManufacturingOrderPageObject getManufacturingOrderPage(WebDriver driver) {
        if (manufacturingOrderPage == null) {
            manufacturingOrderPage = new ManufacturingOrderPageObject(driver);
        }
        return manufacturingOrderPage;
    }
}
