package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CompleteScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CompleteScreenBase.class)
public class CompleteScreen extends CompleteScreenBase {
    public CompleteScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'CHECKOUT: COMPLETE!'`]")
    private ExtendedWebElement titleOfCheckoutScreen;

    @Override
    public boolean isOpened() {
        return titleOfCheckoutScreen.isElementPresent();
    }


}
