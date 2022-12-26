package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.ios;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CatalogScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.SwagLabsLogInScreenBase;
import org.openqa.selenium.WebDriver;

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

    @ExtendedFindBy(accessibilityId = "Sorry, this user has been locked out.")
    private ExtendedWebElement errorMessage;


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
    public CatalogScreenBase clickLogInBtn() {
        logInBtn.click();
        return initPage(getDriver(), CatalogScreenBase.class);
    }

    @Override
    public boolean isLockOutMessagePresent() {
        return errorMessage.isElementPresent();
    }


}
