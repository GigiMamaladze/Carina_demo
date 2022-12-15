package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoggedAccountPage extends AbstractPage {
    public LoggedAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    private ExtendedWebElement messageAboutAccount;

    public boolean isAccountDisplayed() {
        return messageAboutAccount.isElementPresent();
    }


}
