package com.qaprosoft.carina.demo.mobile.gui.carinaapplication.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.RegirtrationPageBase;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.UserAccountPageBase;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = RegirtrationPageBase.class)
public class RegistrationPage extends RegirtrationPageBase {

    @FindBy(id = "name")
    private ExtendedWebElement nameTextBox;

    @FindBy(id = "password")
    private ExtendedWebElement passwordTextBox;

    @FindBy(id = "radio_male")
    private ExtendedWebElement radioMale;

    @FindBy(id = "radio_female")
    private ExtendedWebElement radioFemale;

    @FindBy(id = "checkbox")
    private ExtendedWebElement agreeCheckBox;

    @FindBy(id = "login_button")
    private ExtendedWebElement signInBtn;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public UserAccountPageBase logIn(User user, String gender) {
        nameTextBox.type(user.getLogin());
        passwordTextBox.type(user.getPassword());
        switch (gender) {
            case "Male":
                radioMale.click();
                break;
            case "Female":
                radioFemale.click();
                break;
            default:
                throw new RuntimeException("Gender is not Correct");
        }
        agreeCheckBox.click();
        signInBtn.click();
        return initPage(getDriver(), UserAccountPageBase.class);
    }

    @Override
    public void tapName(String name) {

    }

    @Override
    public void tapPassword(String password) {

    }

    @Override
    public void chooseMaleGender() {

    }

    @Override
    public void chooseFemaleGender() {

    }

    @Override
    public void clickAgree() {

    }

    @Override
    public void clickSingUpBtn() {

    }


}
