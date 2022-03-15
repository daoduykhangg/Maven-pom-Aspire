package pageUIs;

public class ProductPageUI {
    public static final String PRODUCT_MENU_BUTTON = "//span[text()='Products']/parent::button";
    public static final String PRODUCT_SUB_MENU_LINK = "//a[text()='Products']";
    public static final String CREATE_BUTTON_AT_PRODUCT_SCREEN = "//button[contains(text(),'Create')]";
    public static final String PRODUCT_NAME_TEXTBOX = "//label[text()='Product Name']/following-sibling::h1//input";
    public static final String UPDATE_QUANTITY_BUTTON = "//span[text()='Update Quantity']/parent::button";
    public static final String CREATE_BUTTON_AT_UPDATE_QUANTITY_SCREEN = "//button[contains(text(),'Create')]";
    public static final String COUNTED_QUANTITY_TEXTBOX_BY_PRODUCT_NAME = "//a[@name='product_id' and text()='%s']/parent::td/following-sibling::td/input[@name='inventory_quantity']";
    public static final String SAVE_BUTTON_AT_UPDATE_QUANTITY_SCREEN = "//button[contains(text(),'Save')]";
    public static final String APPLICATION_ICON = "//a[@title='Home menu']";
}
