package com.qaprosoft.carina.demo.gui.automation_excercise.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AdBanner extends AbstractUIObject {
    public AdBanner(WebDriver driver) {
        super(driver);
    }

    public AdBanner(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = "//*[@id='card']")
    private ExtendedWebElement banner;

    @FindBy(xpath = "//*[@id='dismiss-button']")
    private ExtendedWebElement dismissButton;

    public boolean isBannerPresent() {
        return banner.isElementPresent(5);
    }

    public void clickDismissBtn() {
        dismissButton.click();
    }


}
