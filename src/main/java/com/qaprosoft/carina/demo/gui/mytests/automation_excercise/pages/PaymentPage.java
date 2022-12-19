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

    public void typeCardNumber(String cardNumber) {
        cardNumberTextField.type(cardNumber);
    }

    public void typeCvc(String cvc) {
        cvcTextField.type(cvc);
    }

    public void typeMonth(String month) {
        monthTextField.type(month);
    }

    public void typeYear(String year) {
        yearTextField.type(year);
    }

    public void scrollToSubmitBtn() {
        submitBtn.scrollTo();
    }

    public PaymentDonePage clickSubmitBtn() {
        submitBtn.click();
        return new PaymentDonePage(getDriver());
    }
}
