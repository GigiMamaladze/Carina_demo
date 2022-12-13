package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends AbstractPage {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[text()='Contact ']")
    private ExtendedWebElement title;

    @FindBy(xpath = "//*[@name='name']")
    private ExtendedWebElement nameTextField;

    @FindBy(xpath = "//*[@name='email']")
    private ExtendedWebElement emailTextField;

    @FindBy(xpath = "//*[@name='subject']")
    private ExtendedWebElement subjectTextField;

    @FindBy(xpath = "//*[@name='message']")
    private ExtendedWebElement messageTextArea;

    @FindBy(xpath ="//*[@name='message']")
    private ExtendedWebElement submitBtn;


    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public void typeEmail(String email){
        emailTextField.type(email);
    }

    public void typeName(String name){
        nameTextField.type(name);
    }

    public void typeSubject(String subject){
        subjectTextField.type(subject);
    }

    public void typeMessage(String message){
        messageTextArea.type(message);
    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }
}
