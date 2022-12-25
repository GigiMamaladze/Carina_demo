package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.ProductScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.ItemsScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ItemsScreenBase.class)
public class ItemsScreen extends ItemsScreenBase {
    public ItemsScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'PRODUCTS')]")
    private ExtendedWebElement productsTitle;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'%s')]//ancestor::*[@content-desc='test-Item']//*[@text='ADD TO CART']")
    private ExtendedWebElement productList;

    @Override
    public boolean isOpened() {
        return productsTitle.isElementPresent();
    }

    @Override
    public void clickAddToCartBtn(String product) {
        productList.format(product).click();
    }

    @Override
    public ProductScreenBase clickOnProduct(String product) {
        return null;
    }

    @Override
    public void clickRemoveBtn(String product) {

    }

    @Override
    public boolean isAddToCartBtnPresent(String product) {
        return false;
    }

    @Override
    public boolean isRemoveBtnPresent(String product) {
        return false;
    }
}
