package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CompleteScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CompleteScreenBase.class)
public class CompleteScreen extends CompleteScreenBase {
    public CompleteScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'CHECKOUT: COMPLETE!')]")
    private ExtendedWebElement titleOfCheckoutScreen;

    @Override
    public boolean isOpened() {
        return titleOfCheckoutScreen.isElementPresent();
    }

}
