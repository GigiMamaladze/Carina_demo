package com.qaprosoft.carina.demo.gui.mytests.steam.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class SteamGuardPage extends AbstractPage {
    private static final Logger LOGGER = LogManager.getLogger(SteamGuardPage.class);


    @FindBy(xpath = "//*[@class='newlogindialog_SegmentedCharacterInput_1kJ6q']/input")
    private ExtendedWebElement codePage;

    public SteamGuardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCodePageExsit(){
        return codePage.isElementPresent();
    }

    public PaymentProcessHomePage writeCode(){
      return new PaymentProcessHomePage(getDriver());
    }

}
