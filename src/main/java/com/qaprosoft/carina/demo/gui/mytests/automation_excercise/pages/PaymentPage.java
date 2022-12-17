package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.json.XML;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends AbstractPage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Payment']")
    private ExtendedWebElement paymentPayment;

    @FindBy(xpath = "//*[@name='name_on_card']")
    private ExtendedWebElement nameOnCardTextField;

    @FindBy(xpath = "//*[@name='card_number']")
    private ExtendedWebElement cardNumberTextField;

    @FindBy(xpath = "//*[@name='cvc']")
    private ExtendedWebElement cvcTextField;

    @FindBy(xpath = "//*[@name='expiry_month']")
    private ExtendedWebElement monthTextField;

    @FindBy(xpath = "//*[@name='expiry_year']")
    private ExtendedWebElement yearTextField;

    @FindBy(xpath = "//*[@id='submit']")
    private ExtendedWebElement submitBtn;

    @Override
    public boolean isPageOpened() {
        return paymentPayment.isElementPresent();
    }


    public void typeNameOnCard(String nameOnCard) {
        nameOnCardTextField.type(nameOnCard);
    }

    public void typeCardNumber(int cardNumber) {
        cardNumberTextField.type(String.valueOf(cardNumber));
    }

    public void typeCvc(int cvc) {
        cvcTextField.type(String.valueOf(cvc));
    }

    public void typeMonth(int month) {
        monthTextField.type(String.valueOf(month));
    }

    public void typeYear(int year) {
        yearTextField.type(String.valueOf(year));
    }

    public void scrollToSubmitBtn() {
        submitBtn.scrollTo();
    }

    public PaymentDonePage clickSubmitBtn() {
        submitBtn.click();
        return new PaymentDonePage(getDriver());
    }
}
