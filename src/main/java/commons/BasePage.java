package commons;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    protected void openPageUrl(WebDriver driver, String url) {
        driver.get(url);
    }

    protected By getByXpath(String locator) {
        return By.xpath(locator);
    }

    protected WebElement getElement(WebDriver driver, String locator) {
        return driver.findElement(getByXpath(locator));
    }

    protected List<WebElement> getElements(WebDriver driver, String locator) {
        return driver.findElements(getByXpath(locator));
    }

    protected String getDynamicLocator(String locator, String... params) {
        return locator = String.format(locator, (Object[]) params);
    }

    protected void clickToElement(WebDriver driver, String locator) {
        getElement(driver, locator).click();
    }

    protected void clickToElement(WebDriver driver, String locator, String... params) {
        getElement(driver, getDynamicLocator(locator, params)).click();
    }

    protected void sendkeyToElement(WebDriver driver, String locator, String value) {
        WebElement element = getElement(driver, locator);
        element.clear();
        element.sendKeys(value);
    }

    protected void sendkeyToElement(WebDriver driver, String locator, String value, String... params) {
        WebElement element = getElement(driver, getDynamicLocator(locator, params));
        element.clear();
        element.sendKeys(value);
    }

    protected boolean isElementDisplayed(WebDriver driver, String locator) {
        return getElement(driver, locator).isDisplayed();
    }

    protected boolean isElementDisplayed(WebDriver driver, String locator, String... params) {
        return getElement(driver, getDynamicLocator(locator, params)).isDisplayed();
    }

    protected String getElementText(WebDriver driver, String locator) {
        return getElement(driver, locator).getText().trim();
    }

    protected void acceptAlert(WebDriver driver) {
        alert = explicitwait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    protected void selectToCustomEditDropdown(WebDriver driver, String parentLocator, String childLocator, String expectedItem) {
        waitForElementVisible(driver, parentLocator);
        sendkeyToElement(driver, parentLocator, expectedItem);
        sleepInSecond(1);
        waitForAllElementsVisible(driver, childLocator);
        List<WebElement> options = getElements(driver, childLocator);
        for (WebElement option : options) {
            String actualItem = option.getText();
            if (actualItem.equals(expectedItem)) {
                option.click();
                break;
            }
        }
    }

    protected void pressKeyBoardToElement(WebDriver driver, String locator, Keys key) {
        action = new Actions(driver);
        action.sendKeys(getElement(driver, locator), key).perform();
    }

    protected void waitForAllElementsVisible(WebDriver driver, String locator) {
        explicitwait = new WebDriverWait(driver, timeout);
        explicitwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(getByXpath(locator)));
    }

    protected void waitForElementVisible(WebDriver driver, String locator) {
        explicitwait = new WebDriverWait(driver, timeout);
        explicitwait.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(locator)));
    }

    protected void waitForElementVisible(WebDriver driver, String locator, String... params) {
        explicitwait = new WebDriverWait(driver, timeout);
        explicitwait.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(getDynamicLocator(locator, params))));
    }

    protected void waitForElementClickable(WebDriver driver, String locator) {
        explicitwait = new WebDriverWait(driver, timeout);
        explicitwait.until(ExpectedConditions.elementToBeClickable(getByXpath(locator)));
    }

    protected void waitForElementClickable(WebDriver driver, String locator, String... params) {
        explicitwait = new WebDriverWait(driver, timeout);
        explicitwait.until(ExpectedConditions.elementToBeClickable(getByXpath(getDynamicLocator(locator, params))));
    }

    public void sleepInSecond(long second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private WebDriverWait explicitwait;
    private Actions action;
    private Alert alert;
    private long timeout = 15;
}
