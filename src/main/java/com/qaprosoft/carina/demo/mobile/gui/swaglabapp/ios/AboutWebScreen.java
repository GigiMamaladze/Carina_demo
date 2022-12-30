package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.AboutWebScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AboutWebScreenBase.class)
public class AboutWebScreen extends AboutWebScreenBase {
    public AboutWebScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "navigation")
    private ExtendedWebElement webPage;

    @Override
    public boolean isOpened() {
        return webPage.isElementPresent();
    }
}
