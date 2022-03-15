package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToInventoryFeatureLink() {
        waitForElementClickable(driver, HomePageUI.INVENTORY_FEATURE_LINK);
        clickToElement(driver, HomePageUI.INVENTORY_FEATURE_LINK);
    }

    public void clickToManufacturingFeatureLink() {
        waitForElementClickable(driver, HomePageUI.MANUFACTURING_FEATURE_LINK);
        clickToElement(driver, HomePageUI.MANUFACTURING_FEATURE_LINK);
    }
}
