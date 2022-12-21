package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CartScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.TopBarMenuBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.TopLeftMenuBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = TopBarMenuBase.class)
public class TopBarMenu extends TopBarMenuBase {
    public TopBarMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']")
    private ExtendedWebElement cartBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Menu']")
    private ExtendedWebElement topLeftMenu;

    @Override
    public CartScreenBase clickCartIconBtn() {
        cartBtn.click();
        return initPage(getDriver(), CartScreenBase.class);
    }

    @Override
    public TopLeftMenuBase clickTopLeftMenuBtn() {
        topLeftMenu.click();
        return initPage(getDriver(), TopLeftMenuBase.class);
    }
}
