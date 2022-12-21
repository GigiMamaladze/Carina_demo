package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.annotations.ClassChain;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CheckoutScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CheckoutOverviewScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutScreenBase.class)
public class CheckoutScreen extends CheckoutScreenBase {
    public CheckoutScreen(WebDriver driver) {
        super(driver);
    }

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == 'CHECKOUT: INFORMATION'`]")
    private ExtendedWebElement titleOfCheckoutPage;

    @ExtendedFindBy(accessibilityId = "test-First Name")
    private ExtendedWebElement firstNameTextField;

    @ExtendedFindBy(accessibilityId = "test-Last Name")
    private ExtendedWebElement lastNameTextField;

    @ExtendedFindBy(accessibilityId = "test-Zip/Postal Code")
    private ExtendedWebElement zipcodeTextField;

    @ExtendedFindBy(accessibilityId = "test-CONTINUE")
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
