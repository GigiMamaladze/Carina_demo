package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.ProductsScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.SwagLabsLogInScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SwagLabsLogInScreenBase.class)
public class SwagLabsLogInScreen extends SwagLabsLogInScreenBase {
    public SwagLabsLogInScreen(WebDriver driver) {
        super(driver);
    }


    @ExtendedFindBy(accessibilityId = "test-Username")
    private ExtendedWebElement userNameTextField;

    @ExtendedFindBy(accessibilityId = "test-Password")
    private ExtendedWebElement passwordTextField;

    @ExtendedFindBy(accessibilityId = "test-LOGIN")
    private ExtendedWebElement logInBtn;

    @Override
    public boolean isOpened() {
        return logInBtn.isElementPresent();
    }

    @Override
    public void typeUserName(String userName) {
        userNameTextField.type(userName);
    }

    @Override
    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    @Override
    public ProductsScreenBase clickLogInBtn() {
        logInBtn.click();
        return initPage(getDriver(), ProductsScreenBase.class);
    }


}
