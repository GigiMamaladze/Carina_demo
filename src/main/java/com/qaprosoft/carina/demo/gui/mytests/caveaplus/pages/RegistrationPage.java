package com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Day;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Gender;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Month;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration.Year;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.models.registration.CaveaPlusUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {
    @FindBy(xpath = "//button[text()=' Sign up ']")
    private ExtendedWebElement registrationBtn;
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='firstName']")
    private ExtendedWebElement firstNameTextBox;

    @FindBy(xpath = "//*[@name='lastName']")
    private ExtendedWebElement lastNameTextBox;

    @FindBy(xpath = "//*[@customclass ='registration-day']/div/button")
    private ExtendedWebElement dayListBox;

    @FindBy(xpath = "//a[text()='%s']/..")
    private ExtendedWebElement dayList;

    @FindBy(xpath = "//*[@customclass='registration-month']")
    private ExtendedWebElement monthListBox;

    @FindBy(xpath = "//a[text()='%s']/..")
    private ExtendedWebElement monthList;

    @FindBy(xpath = "//*[@customclass='registration-year']")
    private ExtendedWebElement yearListBox;

    @FindBy(xpath = "//a[text()='%s']/..")
    private ExtendedWebElement yearList;

    @FindBy(xpath = "//*[@customclass='registration-gender']")
    private ExtendedWebElement genderListBox;

    @FindBy(xpath = "//a[text()='%s']/..")
    private ExtendedWebElement genreList;

    @FindBy(xpath = "//*[@name='phone']")
    private ExtendedWebElement phoneNumberTextBox;

    @FindBy(xpath = "//*[@name='email']")
    private ExtendedWebElement emailTextBox;

    @FindBy(xpath = "//*[@name='password']")
    private ExtendedWebElement passwordTextBox;

    @FindBy(xpath = "//*[@name='rePassword']")
    private ExtendedWebElement rePasswordTextBox;



    @Override
    public boolean isPageOpened() {
        return registrationBtn.isElementPresent();
    }

    public void typeFirstName(String name){
        firstNameTextBox.type(name);
    }

    public void typeLastName(String lastName){
        lastNameTextBox.type(lastName);
    }

    public void chooseDay(Day day){
        dayListBox.click();
        dayList.format(day.getDay()).scrollTo();
        dayList.format(day.getDay()).click();
    }

    public void chooseMonth(Month month){
        monthListBox.click();
        monthList.format(month.getMonth()).scrollTo();
        monthList.format(month.getMonth()).click();
    }

    public void chooseYear(Year year){
        yearListBox.click();
        yearList.format(year.getYear()).scrollTo();
        yearList.format(year.getYear()).click();
    }

    public void chooseGender(Gender gender){
        genderListBox.click();
        genreList.format(gender.getGender()).click();
    }

    public void typePhoneNumber(String phone){
        phoneNumberTextBox.type(phone);
    }

    public void typeEmail(String email){
        emailTextBox.type(email);
    }

    public void typePassword(String password){
        passwordTextBox.type(password);
    }

    public void typeRePassword(String rePassword){
        rePasswordTextBox.type(rePassword);
    }

    public void inputUserInformation(CaveaPlusUser user){
        typeFirstName(user.getFirstName());
        typeLastName(user.getLastName());
        chooseDay(user.getDay());
        chooseMonth(user.getMonth());
        chooseYear(user.getYear());
        chooseGender(user.getGender());
        typePhoneNumber(user.getPhoneNumber());
        typeEmail(user.getEmail());
        typePassword(user.getPassword());
        typeRePassword(user.getPassword());
    }
}
