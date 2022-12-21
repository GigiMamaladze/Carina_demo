package com.qaprosoft.carina.demo.mobile.gui.carinaapplication.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.ContentFramePageBase;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.UserAccountPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UserAccountPageBase.class)
public class UserAccountPage extends UserAccountPageBase {
    @FindBy(id = "content_frame")
    private ExtendedWebElement contentFrame;


    public UserAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContentFramePageBase clickContentFrame() {
        contentFrame.click();
        return initPage(getDriver(), ContentFramePageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return contentFrame.isElementPresent();
    }
}
