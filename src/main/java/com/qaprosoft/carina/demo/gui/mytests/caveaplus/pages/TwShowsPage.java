package com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.MainMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TwShowsPage extends AbstractPage  {
    @FindBy(xpath = "//*[@id='main-navbar']/div/div[1]/a/span")
    private ExtendedWebElement caveaLogo;

    @FindBy(xpath = "//*[@class='nav header-menu ng-star-inserted']")
    private MainMenu mainMenu;
    public TwShowsPage(WebDriver driver) {
        super(driver);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }
}
