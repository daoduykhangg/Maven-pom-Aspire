package pageUIs;

public class ManufacturingOrderPageUI {
    public static final String CREATE_BUTTON = "//button[contains(text(),'Create')]";
    public static final String PRODUCT_DROPDOWN = "//label[text()='Product']/parent::td/following-sibling::td//input";
    public static final String CHILD_OPTIONS_DROPDOWN = "//li[@class='ui-menu-item']/a";
    public static final String BUTTON_CURRENT_STATE_BY_NAME = "//button[@title='Current state' and contains(text(), '%s')]";
    public static final String CONFIRM_BUTTON = "//span[text()='Confirm']/parent::button";
    public static final String MARK_AS_DONE_BUTTON = "//span[text()='Mark as Done']/parent::button[@class='btn btn-primary']";
    public static final String OK_BUTTON_AT_CONFIRMATION_POPUP = "//div[@class='modal-content']//span[text()='Ok']/parent::button";
    public static final String APPLY_BUTTON_AT_IMMEDIATE_PRODUCTION_POPUP = "//div[@class='modal-content']//span[text()='Apply']/parent::button";
    public static final String MANUFACTURING_ORDER_TEXT = "//span[@placeholder='Manufacturing Reference']";
    public static final String SAVE_BUTTON = "//button[contains(text(),'Save')]";
    public static final String MANUFACTURING_LINK = "//a[text()='Manufacturing']";
    public static final String REMOVE_ICON_BY_NAME = "//span[text()='%s']/parent::div/following-sibling::i";
    public static final String SEARCH_TEXTBOX = "//input[@title='Search for records']";
    public static final String MANUFACTURING_ORDER_ROW = "//td[text()='%s']/following-sibling::td[text()='%s']/following-sibling::td[text()='%s']/following-sibling::td[text()='%s']/following-sibling::td/span[text()='%s']";

}
