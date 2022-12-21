package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CartScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.TopBarMenuBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.TopLeftMenuBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = TopBarMenuBase.class)
public class TopBarMenu extends TopBarMenuBase {
    public TopBarMenu(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[`name == \"test-Cart\"`]/XCUIElementTypeOther")
    private ExtendedWebElement cartBtn;

    @ExtendedFindBy(accessibilityId = "test-Menu")
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
