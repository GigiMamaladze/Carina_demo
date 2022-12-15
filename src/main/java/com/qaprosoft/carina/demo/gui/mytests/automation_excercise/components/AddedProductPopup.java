package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AddedProductPopup extends AbstractPage {
    public AddedProductPopup(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    private ExtendedWebElement continueShoppingBtn;

    @Override
    public boolean isPageOpened() {
        return continueShoppingBtn.isElementPresent();
    }

    public void clickContinueShoppingBtn() {
        continueShoppingBtn.click();
    }
}
