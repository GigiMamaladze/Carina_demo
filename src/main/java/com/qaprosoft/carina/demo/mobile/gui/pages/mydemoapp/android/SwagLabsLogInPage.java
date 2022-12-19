package com.qaprosoft.carina.demo.mobile.gui.pages.mydemoapp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.mydemoapp.common.SwagLabsLogInPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = SwagLabsLogInPageBase.class)
public class SwagLabsLogInPage extends SwagLabsLogInPageBase {
    public SwagLabsLogInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeUserName(String userName) {

    }

}
