package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.ProductPageUI;

public class ProductPageObject extends BasePage {
    private WebDriver driver;

    public ProductPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToProductsMenu() {
        waitForElementClickable(driver, ProductPageUI.PRODUCT_MENU_BUTTON);
        clickToElement(driver, ProductPageUI.PRODUCT_MENU_BUTTON);
    }

    public void clickToProductsSubMenu() {
        waitForElementClickable(driver, ProductPageUI.PRODUCT_SUB_MENU_LINK);
        clickToElement(driver, ProductPageUI.PRODUCT_SUB_MENU_LINK);
    }

    public void clickToCreateButtonAtProductsScreen() {
        waitForElementClickable(driver, ProductPageUI.CREATE_BUTTON_AT_PRODUCT_SCREEN);
        clickToElement(driver, ProductPageUI.CREATE_BUTTON_AT_PRODUCT_SCREEN);
    }

    public void enterToProductNameTextbox(String productName) {
        waitForElementVisible(driver, ProductPageUI.PRODUCT_NAME_TEXTBOX);
        sendkeyToElement(driver, ProductPageUI.PRODUCT_NAME_TEXTBOX, productName);
    }

    public void clickToUpdateQuantityButton() {
        waitForElementClickable(driver, ProductPageUI.UPDATE_QUANTITY_BUTTON);
        clickToElement(driver, ProductPageUI.UPDATE_QUANTITY_BUTTON);
    }

    public void clickToCreateButtonAtUpdateQuantityScreen() {
        waitForElementClickable(driver, ProductPageUI.CREATE_BUTTON_AT_UPDATE_QUANTITY_SCREEN);
        clickToElement(driver, ProductPageUI.CREATE_BUTTON_AT_UPDATE_QUANTITY_SCREEN);
    }

    public void enterToCountedQuantityTextboxByProductName(String productName, String quantity) {
        waitForElementVisible(driver, ProductPageUI.COUNTED_QUANTITY_TEXTBOX_BY_PRODUCT_NAME, productName);
        sendkeyToElement(driver, ProductPageUI.COUNTED_QUANTITY_TEXTBOX_BY_PRODUCT_NAME, quantity, productName);
    }

    public void clickToSaveButton() {
        waitForElementClickable(driver, ProductPageUI.SAVE_BUTTON_AT_UPDATE_QUANTITY_SCREEN);
        clickToElement(driver, ProductPageUI.SAVE_BUTTON_AT_UPDATE_QUANTITY_SCREEN);
    }

    public void clickToApplicationIcon() {
        waitForElementClickable(driver, ProductPageUI.APPLICATION_ICON);
        clickToElement(driver, ProductPageUI.APPLICATION_ICON);
    }
}
