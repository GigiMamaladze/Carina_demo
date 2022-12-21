package com.qaprosoft.carina.demo.gui.caveaplus.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends AbstractPage {
    @FindBy(xpath = "//*[text()=' Log in ']")
    private ExtendedWebElement logInBtn;

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logInBtn.isElementPresent();
    }
}
