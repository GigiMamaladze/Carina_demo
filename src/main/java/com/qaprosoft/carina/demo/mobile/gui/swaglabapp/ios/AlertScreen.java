package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.AlertScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AlertScreenBase.class)
public class AlertScreen extends AlertScreenBase {
    public AlertScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "OK")
    private ExtendedWebElement allowBtn;

    @Override
    public boolean isAlertPresent() {
        return allowBtn.isElementPresent();
    }

    @Override
    public void clickAllowBtn() {
        allowBtn.click();
    }
}
