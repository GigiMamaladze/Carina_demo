package com.qaprosoft.carina.demo.gui.amazon.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.amazon.pages.SearchedResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ComputerMenu extends AbstractPage {
    @FindBy(xpath = "//*[@id='hmenu-content']/ul[6]/li[2]/div")
    private ExtendedWebElement computerMenuTitle;

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[6]/li[5]/a")
    private ExtendedWebElement computerAndTabletBtn;

    public ComputerMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return computerMenuTitle.isElementPresent();
    }

    public SearchedResultPage clickComputerComponentsBtn() {
        computerAndTabletBtn.click();
        return new SearchedResultPage(getDriver());
    }

}
