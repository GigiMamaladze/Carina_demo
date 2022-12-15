package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//*[@name='submit']")
    private ExtendedWebElement submitBtn;


    @FindBy(xpath = "//*[text()='Success! Your details have been submitted successfully.']")
    private ExtendedWebElement message;


    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public boolean isMessageSent() {
        return message.isElementPresent();
    }

    public void typeEmail(String email) {
        emailTextField.type(email);
    }

    public void typeName(String name) {
        nameTextField.type(name);
    }

    public void typeSubject(String subject) {
        subjectTextField.type(subject);
    }

    public void typeMessage(String message) {
        messageTextArea.type(message);
    }

    public void uploadFile(String pathToFile) {
        driver.findElement(By.xpath("//*[@name ='upload_file']")).sendKeys(pathToFile);
    }

    public void clickSubmitBtn() {
        submitBtn.scrollTo();
        submitBtn.click();
    }
}
