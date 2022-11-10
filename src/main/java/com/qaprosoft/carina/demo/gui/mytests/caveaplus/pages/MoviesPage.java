package com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.interfaces.IMenuPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MoviesPage extends AbstractPage  {
    @FindBy(xpath = "//*[@id='main-navbar']/div/div[1]/a/span")
    private ExtendedWebElement caveaLogo;

    public MoviesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return caveaLogo.isElementPresent();
    }



}
