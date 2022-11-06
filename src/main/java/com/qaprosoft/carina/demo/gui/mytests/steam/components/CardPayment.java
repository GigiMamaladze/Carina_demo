package com.qaprosoft.carina.demo.gui.mytests.steam.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CardPayment extends AbstractPage {
    @FindBy(xpath = "//*[@id='card_number']")
    private ExtendedWebElement cardNumberTextBox;

    @FindBy(xpath = "//*[@id='first_name']")
    private ExtendedWebElement firstNameTextBox;

    @FindBy(xpath = "//*[@id='last_name']")
    private ExtendedWebElement lastNameTextBox;

    @FindBy(xpath = "//*[@id='billing_city']")
    private ExtendedWebElement cityTextBox;

    @FindBy(xpath = "//*[@id='expiration_month_trigger']")
    private ExtendedWebElement monthList;

    @FindBy(xpath = "//*[@id='expiration_month_droplist']/li[5]")
    private ExtendedWebElement month;

    @FindBy(xpath = "//*[@id='expiration_year_trigger']")
    private ExtendedWebElement yearList;


    @FindBy(xpath = "//*[@id='expiration_year_droplist']/li[5]")
    private ExtendedWebElement year;

    @FindBy(xpath = "//*[@id='security_code']")
    private ExtendedWebElement securityCodeTextBox;

    @FindBy(xpath = "//*[@id='billing_address_two']")
    private ExtendedWebElement addressOneTextBox;

    @FindBy(xpath = "//*[@id='billing_address']")
    private ExtendedWebElement addressTwoTextBox;

    @FindBy(xpath = "//*[@id='billing_postal_code']")
    private ExtendedWebElement postalCodeTextBox;



    @FindBy(xpath = "//*[@id='billing_phone']")
    private ExtendedWebElement phoneNumberTextBox;

    @FindBy(xpath = "//*[@id='save_my_address']")
    private ExtendedWebElement saveCheckBox;

    @FindBy(xpath = "//*[@id='submit_payment_info_btn']")
    private ExtendedWebElement continueBtn;

    public CardPayment(WebDriver driver) {
        super(driver);
    }

    public void cardPaymantservice(String cardNumber){
        cardNumberTextBox.type(String.valueOf(cardNumber));
    }


    public void fillFields(Long cardNumber,String firstname,String lastname,String city,int code,String addressOne,String addressTwo,int zip, int phone ){
        cardNumberTextBox.type(String.valueOf(cardNumber));
        firstNameTextBox.type(firstname);
        lastNameTextBox.type(lastname);
        cityTextBox.type(city);
        monthList.click();
        month.click();
        yearList.click();
        year.click();
        securityCodeTextBox.type(String.valueOf(code));
        addressOneTextBox.type(addressOne);
        addressTwoTextBox.type(addressTwo);
        postalCodeTextBox.type(String.valueOf(zip));
        phoneNumberTextBox.type(String.valueOf(phone));
        continueBtn.click();
    }



}
