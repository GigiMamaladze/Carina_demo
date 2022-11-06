package com.qaprosoft.carina.demo.gui.mytests.movies_silk;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchedMoviePage extends AbstractPage {
    @FindBy(xpath = "//*[@id='root']/div/section/header/ul/li[6]/img")
    private ExtendedWebElement imdLogo;

    public SearchedMoviePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return imdLogo.isElementPresent();
    }

}
