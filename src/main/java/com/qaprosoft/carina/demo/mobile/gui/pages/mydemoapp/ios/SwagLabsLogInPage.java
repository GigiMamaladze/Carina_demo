package com.qaprosoft.carina.demo.mobile.gui.pages.mydemoapp.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.mydemoapp.common.SwagLabsLogInPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = SwagLabsLogInPageBase.class)
public class SwagLabsLogInPage extends SwagLabsLogInPageBase {
    public SwagLabsLogInPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "test-Username")
    private ExtendedWebElement userNameTextField;

    @FindBy(id = "test-Password")
    private ExtendedWebElement passwordTextField;


    @Override
    public void typeUserName(String userName) {
      userNameTextField.type(userName);
    }

}