package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.ProductsScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.SwagLabsLogInScreenBase;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SwagLabsLogInScreenBase.class)
public class SwagLabsLogInScreen extends SwagLabsLogInScreenBase {
    public SwagLabsLogInScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeUserName(String userName) {

    }

    @Override
    public void typePassword(String password) {

    }

    @Override
    public ProductsScreenBase clickLogInBtn() {

        return null;
    }

}
