package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CartScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CheckoutScreenBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {
    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label =='%s'`]")
    private ExtendedWebElement productName;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'YOUR CART'`]")
    private ExtendedWebElement cartPageTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[$type == 'XCUIElementTypeStaticText' AND label == '%s'$][-2]/**/XCUIElementTypeOther[`name== 'test-REMOVE'`]")
    private ExtendedWebElement removeProductBtn;

    @ExtendedFindBy(accessibilityId = "test-CHECKOUT")
    private ExtendedWebElement checkoutBtn;

    @Override
    public boolean isOpened() {
        return cartPageTitle.isElementPresent();
    }

    @Override
    public boolean isProductPresent(String product) {
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
