package com.qaprosoft.carina.demo.gui.steam.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.steam.components.PaymentMethodLists;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentProcessHomePage extends AbstractPage {
    @FindBy(xpath = "//*[@id='payment_method_trigger']")
    private ExtendedWebElement paymentList;


    private PaymentMethodLists paymentMethodLists;

    public PaymentProcessHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPaymentMethodListExsit() {
        return paymentList.isElementPresent();
    }


    public PaymentMethodLists choosingPaymentMethod() {
        paymentList.click();
        return new PaymentMethodLists(getDriver());
    }

}
