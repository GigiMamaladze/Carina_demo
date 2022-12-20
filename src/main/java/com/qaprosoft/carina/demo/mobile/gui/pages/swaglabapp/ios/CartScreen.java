package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CartScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CheckoutScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {
    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='%s']")
    private ExtendedWebElement productName;

    @FindBy(xpath = "**/XCUIElementTypeStaticText[`label == 'YOUR CART'`]")
    @ClassChain
    private ExtendedWebElement cartPageTitle;

    @FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'%s')]//ancestor::*[@name='test-Item']//*[@name='test-REMOVE']")
    private ExtendedWebElement removeProductBtn;

    @FindBy(id = "test-CHECKOUT")
    private ExtendedWebElement checkoutBtn;

    @Override
    public boolean isScreenOpened() {
        return cartPageTitle.isElementPresent();
    }

    @Override
    public boolean isProductPresentCart(String product) {
        return productName.format(product).isElementPresent();
    }

    @Override
    public void removeProduct(String product) {
        removeProductBtn.format(product).click();
    }

    @Override
    public CheckoutScreenBase clickCheckoutBtn() {
        checkoutBtn.click();
        return initPage(getDriver(), CheckoutScreenBase.class);
    }

}
