package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.AllertScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AllertScreenBase.class)
public class AllertScreen extends AllertScreenBase {
    public AllertScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "OK")
    private ExtendedWebElement allowBtn;

    @Override
    public boolean isAllertPresent() {
        return allowBtn.isElementPresent();
    }

    @Override
    public void clickAllowBtn() {
        allowBtn.click();
    }
}
