package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.ProductsScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {
    public ProductsScreen(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "**/XCUIElementTypeStaticText[`label == 'PRODUCTS'`]")
    @ClassChain
    private ExtendedWebElement productsTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'%s')]//ancestor::*[@name='test-Item']//*[@name='test-ADD TO CART']")
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
