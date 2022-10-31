package com.qaprosoft.carina.demo.gui.mytests.steam.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BuyGamePage extends AbstractPage {
    @FindBy(xpath = "//*[@id='btn_purchase_self']/span")
    private ExtendedWebElement purchaseForMyselfBtn;
    public BuyGamePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPurchaseForMyselfBtnPresent(){
        return purchaseForMyselfBtn.isElementPresent();
    }

    public UserSignInPage clickPurchaseForMyselfBtn(){
        purchaseForMyselfBtn.click();
        return new UserSignInPage(getDriver());
    }


}
