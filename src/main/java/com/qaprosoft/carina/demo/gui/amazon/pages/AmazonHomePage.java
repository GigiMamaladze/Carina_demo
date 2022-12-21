package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.amazon.components.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends AbstractPage {
    @FindBy(xpath = "//*[@id='nav-logo-sprites']")
    private ExtendedWebElement amazonLogo;

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']/span")
    private ExtendedWebElement menu;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return amazonLogo.isElementPresent();
    }

    public Menu clickMenu() {
        menu.click();
        return new Menu(getDriver());
    }


}
