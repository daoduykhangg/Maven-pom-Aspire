package aspire.odoo;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

import java.security.SecureRandom;

public class Order_01_Create_Product_And_Manufacturing_Order extends BaseTest {
    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String urlApp) {
        email = "user@aspireapp.com";
        password = "@sp1r3app";
        productName = "Fastfood".concat(String.valueOf(new SecureRandom().nextInt(999)));
        quantity = "50.00";
        uom = "Units";
        state = "Done";

        log.info("Precondition - Step 01: Open Aspire website");
        driver = getBrowserDriver(browserName, urlApp);
        loginPage = PageGeneratorManager.getLoginPage(driver);

        log.info("Precondition - Step 02: Enter to 'Email' textbox with value = " + email);
        loginPage.enterToEmailTextox(email);

        log.info("Precondition - Step 03: Enter to 'Password' textbox with value = " + password);
        loginPage.enterToPasswordTextbox(password);

        log.info("Precondition - Step 04: Click to 'login' button");
        loginPage.clickToLoginButton();
        homePage = PageGeneratorManager.getHomePage(driver);
    }

    @Test
    public void TC_01_Create_New_Product() {
        log.info("Create Product - Step 01: Click to 'Inventory' link");
        homePage.clickToInventoryFeatureLink();
        productPage = PageGeneratorManager.getProductPage(driver);

        log.info("Create Product - Step 02: Click to 'Products' Menu");
        productPage.clickToProductsMenu();

        log.info("Create Product - Step 03: Click to 'Products' Sub Menu");
        productPage.clickToProductsSubMenu();

        log.info("Create Product - Step 04: Click to 'Create' button at Products Page");
        productPage.clickToCreateButtonAtProductsScreen();

        log.info("Create Product - Step 05: Enter to 'Product Name' textbox with value = " + productName);
        productPage.enterToProductNameTextbox(productName);

        log.info("Create Product - Step 06: Click to 'Update Quantity' button");
        productPage.clickToUpdateQuantityButton();

        log.info("Create Product - Step 07: Click to 'Create' button at Update Quantity Page");
        productPage.clickToCreateButtonAtUpdateQuantityScreen();

        log.info("Create Product - Step 08: Enter to 'Counted Quantity' textbox with value = " + quantity);
        productPage.enterToCountedQuantityTextboxByProductName(productName, quantity);

        log.info("Create Product - Step 09: Click to 'Save' button at Update Quantity Page");
        productPage.clickToSaveButton();

        log.info("Create Product - Step 10: Click to Application icon");
        productPage.clickToApplicationIcon();
        homePage = PageGeneratorManager.getHomePage(driver);

    }

    @Test
    public void TC_02_Create_New_Manufacturing_Order_item() {
        log.info("Create Manufacturing Order - Step 01: Click to 'Manufacturing' link");
        homePage.clickToManufacturingFeatureLink();
        manufacturingOrderPage = PageGeneratorManager.getManufacturingOrderPage(driver);

        log.info("Create Manufacturing Order - Step 02: Click to 'Create' button at Manufacturing order screen");
        manufacturingOrderPage.clickToCreateButton();

        log.info("Create Manufacturing Order - Step 03: Verify 'Draft' button with title = 'Current state' is displayed");
        verifyTrue(manufacturingOrderPage.isButtonCurrentStateDisplayedByName("Draft"));

        log.info("Create Manufacturing Order - Step 04: Select to 'Product' dropdown with value = " + productName);
        manufacturingOrderPage.selectToProductDropdown(productName);

        log.info("Create Manufacturing Order - Step 05: Click to 'Confirm' button");
        manufacturingOrderPage.clickToConfirmButton();

        log.info("Create Manufacturing Order - Step 06: Verify 'Confirmed' button with title = 'Current state' is displayed");
        verifyTrue(manufacturingOrderPage.isButtonCurrentStateDisplayedByName("Confirmed"));

        log.info("Create Manufacturing Order - Step 07: Click to 'Mark as done' button");
        manufacturingOrderPage.clickToMarkAsDone();

        log.info("Create Manufacturing Order - Step 08: Click to 'OK' at 'Confirmation' Popup ");
        manufacturingOrderPage.clickToOkButtonAtConfirmationPopup();

        log.info("Create Manufacturing Order - Step 09: Click to 'Apply' button at 'Confirmation' Popup ");
        manufacturingOrderPage.clickToApplyButtonAtImmediateProductionPopup();

        log.info("Create Manufacturing Order - Step 10: Verify 'Done' button with title = 'Current state' is displayed");
        verifyTrue(manufacturingOrderPage.isButtonCurrentStateDisplayedByName("Done"));

        log.info("Create Manufacturing Order - Step 11: Click to 'Save' button");
        manufacturingOrderPage.clickToSaveButton();

        log.info("Create Manufacturing Order - Step 12: Get Value of 'Manufacturing Order' text");
        manufacturingOrder = manufacturingOrderPage.getTextManufacturingOrder();

        log.info("Create Manufacturing Order - Step 13: Click to 'Manufacturing' link");
        manufacturingOrderPage.clickToManufacturingLink();

        log.info("Create Manufacturing Order - Step 14: Click to 'Remove' icon of Manufacturing Orders Search");
        manufacturingOrderPage.clickToRemoveIconByName("Manufacturing Orders");

        log.info("Create Manufacturing Order - Step 15: Enter to 'Search' textbox with value = " + manufacturingOrder);
        manufacturingOrderPage.enterToSearchTextbox(manufacturingOrder);

        log.info("Create Manufacturing Order - Step 16: Verify new manufacturing order is create with corectted information");
        verifyTrue(manufacturingOrderPage.isManufacturingOrderDisplayed(manufacturingOrder, productName, "1.00", uom, state));

    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }

    private WebDriver driver;
    private String email, password, productName, quantity, manufacturingOrder, uom, state;
    private LoginPageObject loginPage;
    private HomePageObject homePage;
    private ProductPageObject productPage;
    private ManufacturingOrderPageObject manufacturingOrderPage;
}
