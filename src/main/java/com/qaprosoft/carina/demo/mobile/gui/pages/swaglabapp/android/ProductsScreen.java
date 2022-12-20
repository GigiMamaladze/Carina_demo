package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.ProductsScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {
    public ProductsScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'PRODUCTS')]")
    private ExtendedWebElement productsTitle;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'%s')]//ancestor::*[@content-desc='test-Item']//*[@text='ADD TO CART']")
    private ExtendedWebElement productList;

    @Override
    public boolean isScreenOpened() {
        return productsTitle.isElementPresent();
    }

    @Override
    public void clickOnAddToCartBtn(String product) {
        productList.format(product).click();
    }
}
