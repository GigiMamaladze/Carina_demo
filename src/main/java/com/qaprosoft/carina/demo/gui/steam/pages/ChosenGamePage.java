package com.qaprosoft.carina.demo.gui.steam.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ChosenGamePage extends AbstractPage {
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    private ExtendedWebElement addToCartBtn;

    public ChosenGamePage(WebDriver driver) {
        super(driver);
    }

    public boolean isAddToCartBtnPresent() {
        return addToCartBtn.isElementPresent();
    }

    public BuyGamePage clickAddToCartBtn() {
        addToCartBtn.click();
        return new BuyGamePage(getDriver());
    }
}
