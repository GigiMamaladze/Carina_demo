package com.qaprosoft.carina.demo.gui.automation_excercise.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.automation_excercise.pages.CartPage;
import com.qaprosoft.carina.demo.gui.automation_excercise.pages.ContactUsPage;
import com.qaprosoft.carina.demo.gui.automation_excercise.pages.SingUpLogInPage;
import com.qaprosoft.carina.demo.gui.automation_excercise.pages.ProductsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Menu extends AbstractUIObject {

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    private ExtendedWebElement singUpLogInBtn;

    @FindBy(xpath = "//*[text()=' Products']")
    private ExtendedWebElement productsBtn;
    @FindBy(xpath = "//*[text()=' Logged in as ']/b[text()='%s']")
    private ExtendedWebElement messageAboutAccount;
    @FindBy(xpath = "//*[text()=' Cart']")
    private ExtendedWebElement cartBtn;

    @FindBy(xpath = "//*[text()=' Contact us']")
    private ExtendedWebElement contactUsBtn;

    public Menu(WebDriver driver) {
        super(driver);
    }

    public Menu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SingUpLogInPage clickSingUpLogInBtn() {
        singUpLogInBtn.click();
        return new SingUpLogInPage(getDriver());
    }

    public ProductsPage clickProductsBtn() {
        productsBtn.click();
        return new ProductsPage(getDriver());
    }

    public CartPage clickToCartBtn() {
        cartBtn.click();
        return new CartPage(getDriver());
    }

    public ContactUsPage clickToContactUsBtn() {
        contactUsBtn.click();
        return new ContactUsPage(getDriver());
    }

    public boolean isAccountDisplayed(String userName) {
        return messageAboutAccount.format(userName).isElementPresent();
    }

    public void scrollToCartBtn() {
        cartBtn.scrollTo();
    }
}
