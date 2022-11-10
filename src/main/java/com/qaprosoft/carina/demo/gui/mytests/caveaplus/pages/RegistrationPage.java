package com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {
    @FindBy(xpath = "//*[@class='btn btn-gradient-cavea btn-block mt-9 mt-md-12 register-button ng-star-inserted']")
    private ExtendedWebElement registrationBtn;
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return registrationBtn.isElementPresent();
    }
}
