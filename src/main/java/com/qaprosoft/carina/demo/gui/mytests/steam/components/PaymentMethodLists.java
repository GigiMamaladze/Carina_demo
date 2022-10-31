package com.qaprosoft.carina.demo.gui.mytests.steam.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodLists extends AbstractPage {
    @FindBy(xpath = "//*[@id='payment_method_droplist']/li[3]")
    private ExtendedWebElement visaBtn;

    public PaymentMethodLists(WebDriver driver) {
        super(driver);
    }

    public boolean isVisaBtnExsit() {
    return visaBtn.isElementPresent();
    }

    public CardPayment choosePaymentMethod(){
        visaBtn.click();
        return new CardPayment(getDriver());
    }

}
