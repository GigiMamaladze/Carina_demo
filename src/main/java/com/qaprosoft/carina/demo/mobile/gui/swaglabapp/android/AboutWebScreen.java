package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.AboutWebScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AboutWebScreenBase.class)
public class AboutWebScreen extends AboutWebScreenBase {
    public AboutWebScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.android.chrome:id/action_bar_root")
    private ExtendedWebElement webPage;

    @Override
    public boolean isOpened() {
        return webPage.isElementPresent();
    }
}
