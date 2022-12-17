package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentDonePage extends AbstractPage {
    public PaymentDonePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    private ExtendedWebElement congratulationMessage;

    @Override
    public boolean isPageOpened() {
        return congratulationMessage.isElementPresent();
    }
}
