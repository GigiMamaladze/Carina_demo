package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;


import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.SwagLabsLogInScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.TopLeftMenuBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = TopLeftMenuBase.class)
public class TopLeftMenu extends TopLeftMenuBase {
    public TopLeftMenu(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(accessibilityId = "test-LOGOUT")
    private ExtendedWebElement logoutBtn;

    @Override
    public SwagLabsLogInScreenBase clickLogoutBtn() {
        logoutBtn.click();
        return initPage(getDriver(), SwagLabsLogInScreenBase.class);
    }
}
