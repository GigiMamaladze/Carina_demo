package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CheckoutScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.CheckoutOverviewScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CheckoutScreenBase.class)
public class CheckoutScreen extends CheckoutScreenBase {
    public CheckoutScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='CHECKOUT: INFORMATION']")
    private ExtendedWebElement titleOfCheckoutPage;

    @FindBy(id = "test-First Name")
    private ExtendedWebElement firstNameTextField;

    @FindBy(id = "test-Last Name")
    private ExtendedWebElement lastNameTextField;

    @FindBy(id = "test-Zip/Postal Code")
    private ExtendedWebElement zipcodeTextField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-CONTINUE']")
    private ExtendedWebElement continueBtn;

    @Override
    public boolean isOpened() {
        return titleOfCheckoutPage.isElementPresent();
    }

    @Override
    public void typeFirstName(String name) {
        firstNameTextField.type(name);
    }

    @Override
    public void typeLastName(String lastName) {
        lastNameTextField.type(lastName);
    }

    @Override
    public void typeZipcode(String zipCode) {
        zipcodeTextField.type(zipCode);
    }

    @Override
    public CheckoutOverviewScreenBase clickContinueBtn() {
        continueBtn.click();
        return initPage(getDriver(), CheckoutOverviewScreenBase.class);
    }
}
