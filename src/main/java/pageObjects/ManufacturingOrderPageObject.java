package pageObjects;

import commons.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageUIs.ManufacturingOrderPageUI;

public class ManufacturingOrderPageObject extends BasePage {
    private WebDriver driver;

    public ManufacturingOrderPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToCreateButton() {
        waitForElementClickable(driver, ManufacturingOrderPageUI.CREATE_BUTTON);
        clickToElement(driver, ManufacturingOrderPageUI.CREATE_BUTTON);
    }

    public void selectToProductDropdown(String productName) {
        waitForElementVisible(driver, ManufacturingOrderPageUI.PRODUCT_DROPDOWN);
        selectToCustomEditDropdown(driver, ManufacturingOrderPageUI.PRODUCT_DROPDOWN, ManufacturingOrderPageUI.CHILD_OPTIONS_DROPDOWN, productName);
    }

    public void clickToConfirmButton() {
        waitForElementClickable(driver, ManufacturingOrderPageUI.CONFIRM_BUTTON);
        clickToElement(driver, ManufacturingOrderPageUI.CONFIRM_BUTTON);
    }

    public boolean isButtonCurrentStateDisplayedByName(String buttonName) {
        waitForElementVisible(driver, ManufacturingOrderPageUI.BUTTON_CURRENT_STATE_BY_NAME, buttonName);
        return isElementDisplayed(driver, ManufacturingOrderPageUI.BUTTON_CURRENT_STATE_BY_NAME, buttonName);
    }

    public void clickToMarkAsDone() {
        waitForElementClickable(driver, ManufacturingOrderPageUI.MARK_AS_DONE_BUTTON);
        clickToElement(driver, ManufacturingOrderPageUI.MARK_AS_DONE_BUTTON);
    }

    public void acceptConfirmationAlert() {
        acceptAlert(driver);
    }

    public void clickToSaveButton() {
        waitForElementClickable(driver, ManufacturingOrderPageUI.SAVE_BUTTON);
        clickToElement(driver, ManufacturingOrderPageUI.SAVE_BUTTON);
    }

    public String getTextManufacturingOrder() {
        waitForElementVisible(driver, ManufacturingOrderPageUI.MANUFACTURING_ORDER_TEXT);
        return getElementText(driver, ManufacturingOrderPageUI.MANUFACTURING_ORDER_TEXT);
    }

    public void clickToManufacturingLink() {
        waitForElementClickable(driver, ManufacturingOrderPageUI.MANUFACTURING_LINK);
        clickToElement(driver, ManufacturingOrderPageUI.MANUFACTURING_LINK);
    }

    public void enterToSearchTextbox(String manufacturingOrder) {
        waitForElementVisible(driver, ManufacturingOrderPageUI.SEARCH_TEXTBOX);
        sendkeyToElement(driver, ManufacturingOrderPageUI.SEARCH_TEXTBOX, manufacturingOrder);
        pressKeyBoardToElement(driver, ManufacturingOrderPageUI.SEARCH_TEXTBOX, Keys.ENTER);
    }

    public boolean isManufacturingOrderDisplayed(String manufacturingOrder, String productName, String quantity, String uom, String state) {
        waitForElementVisible(driver, ManufacturingOrderPageUI.MANUFACTURING_ORDER_ROW, manufacturingOrder, productName, quantity, uom, state);
        return isElementDisplayed(driver, ManufacturingOrderPageUI.MANUFACTURING_ORDER_ROW, manufacturingOrder, productName, quantity, uom, state);
    }

    public void clickToRemoveIconByName(String searchType) {
        waitForElementClickable(driver, ManufacturingOrderPageUI.REMOVE_ICON_BY_NAME, searchType);
        clickToElement(driver, ManufacturingOrderPageUI.REMOVE_ICON_BY_NAME, searchType);
    }

    public void clickToOkButtonAtConfirmationPopup() {
        waitForElementClickable(driver, ManufacturingOrderPageUI.OK_BUTTON_AT_CONFIRMATION_POPUP);
        clickToElement(driver, ManufacturingOrderPageUI.OK_BUTTON_AT_CONFIRMATION_POPUP);
    }

    public void clickToApplyButtonAtImmediateProductionPopup() {
        waitForElementClickable(driver, ManufacturingOrderPageUI.APPLY_BUTTON_AT_IMMEDIATE_PRODUCTION_POPUP);
        clickToElement(driver, ManufacturingOrderPageUI.APPLY_BUTTON_AT_IMMEDIATE_PRODUCTION_POPUP);
    }
}
