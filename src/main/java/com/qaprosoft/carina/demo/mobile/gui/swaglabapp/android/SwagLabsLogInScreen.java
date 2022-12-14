package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CatalogScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.SwagLabsLogInScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SwagLabsLogInScreenBase.class)
public class SwagLabsLogInScreen extends SwagLabsLogInScreenBase {
    public SwagLabsLogInScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "test-Username")
    private ExtendedWebElement userNameTextField;

    @FindBy(id = "test-Password")
    private ExtendedWebElement passwordTextField;

    @FindBy(id = "test-LOGIN")
    private ExtendedWebElement logInBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Error message']")
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
