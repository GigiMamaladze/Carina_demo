package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.ProductScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductScreenBase.class)
public class ProductScreen extends ProductScreenBase {
    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Description']/android.widget.TextView[@text='%s']")
    private ExtendedWebElement productName;

    @FindBy(id = "test-ADD TO CART")
    private ExtendedWebElement addToCartBtn;

    @Override
    public boolean isProductPresent(String product) {
        return productName.format(product).isElementPresent();
    }

    @Override
    public void clickAddToCart() {
        swipe(addToCartBtn);
        addToCartBtn.click();
    }
}
