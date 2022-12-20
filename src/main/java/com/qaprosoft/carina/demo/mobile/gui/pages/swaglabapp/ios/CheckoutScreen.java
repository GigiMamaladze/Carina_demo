package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CheckoutScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.OverviewScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutScreenBase.class)
public class CheckoutScreen extends CheckoutScreenBase {
    public CheckoutScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "**/XCUIElementTypeStaticText[`label == 'CHECKOUT: INFORMATION'`]")
    @ClassChain
    private ExtendedWebElement titleOfCheckoutPage;

    @FindBy(id = "test-First Name")
    private ExtendedWebElement firstNameTextField;

    @FindBy(id = "test-Last Name")
    private ExtendedWebElement lastNameTextField;

    @FindBy(id = "test-Zip/Postal Code")
    private ExtendedWebElement zipcodeTextField;

    @FindBy(id = "test-CONTINUE")
    private ExtendedWebElement continueBtn;

    @Override
    public boolean isScreenOpened() {
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
    public OverviewScreenBase clickContinueBtn() {
        continueBtn.click();
        return initPage(getDriver(), OverviewScreenBase.class);
    }
}
