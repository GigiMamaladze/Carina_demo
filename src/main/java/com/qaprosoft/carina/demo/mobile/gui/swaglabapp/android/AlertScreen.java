package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.AlertScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AlertScreenBase.class)
public class AlertScreen extends AlertScreenBase {
    public AlertScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
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
