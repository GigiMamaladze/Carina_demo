package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends AbstractPage {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Address Details']")
    private ExtendedWebElement messageAddressDetail;

    @FindBy(xpath = "//*[text()='%s']")
    private ExtendedWebElement itemsOnCart;

    @FindBy(xpath = "//*[text()='Place Order']")
    private ExtendedWebElement placeOrderBtn;

    @Override
    public boolean isPageOpened() {
        return messageAddressDetail.isElementPresent();
    }


    public boolean isProductPresent(String item) {
        return itemsOnCart.format(item).isElementPresent();
    }

    public void scrollToPlaceOrderBtn() {
        placeOrderBtn.scrollTo();
    }

    public PaymentPage clickToPlaceOrderBtn() {
        placeOrderBtn.click();
        return new PaymentPage(getDriver());
    }

}
