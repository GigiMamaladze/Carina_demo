package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CartScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CheckoutScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {
    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Description']/android.widget.TextView[contains(@text,'%s')]")
    private ExtendedWebElement productName;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'YOUR CART')]")
    private ExtendedWebElement cartPageTitle;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'%s')]//ancestor::*[@content-desc='test-Item']//*[@content-desc='test-REMOVE']")
    private ExtendedWebElement removeProductBtn;

    @FindBy(id = "test-CHECKOUT")
    private ExtendedWebElement checkoutBtn;

    @Override
    public boolean isOpened() {
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
