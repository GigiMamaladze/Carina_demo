package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.SwagLabsLogInScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.TopLeftMenuBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = TopLeftMenuBase.class)
public class TopLeftMenu extends TopLeftMenuBase {
    public TopLeftMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
    private ExtendedWebElement logoutBtn;

    @Override
    public SwagLabsLogInScreenBase clickLogoutBtn() {
        logoutBtn.click();
        return initPage(getDriver(), SwagLabsLogInScreenBase.class);
    }
}
