package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.ProductInformationScreenBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductInformationScreenBase.class)
public class ProductsInformationScreen extends ProductInformationScreenBase {
    public ProductsInformationScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(image = "images/Sauce_Labs_Backpack.png")
    private ExtendedWebElement image;

    @Override
    public boolean isOpened() {
        return image.isElementPresent();
    }
}
