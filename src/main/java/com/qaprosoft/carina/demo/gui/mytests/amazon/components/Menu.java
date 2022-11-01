package com.qaprosoft.carina.demo.gui.mytests.amazon.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Menu extends AbstractPage {
    @FindBy(xpath = "//*[@id='hmenu-customer-profile']")
    private ExtendedWebElement customerProfileMenu;

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[8]/a")
    private ExtendedWebElement computerMenu;
    public Menu(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return customerProfileMenu.isElementPresent();
    }

    public ComputerMenu clickComputerMenu(){
       computerMenu.click();
       return new ComputerMenu(getDriver());
    }
}
