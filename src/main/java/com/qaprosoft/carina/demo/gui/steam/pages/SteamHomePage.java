package com.qaprosoft.carina.demo.gui.steam.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SteamHomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id='store_nav_search_term']")
    private ExtendedWebElement searchBox;

    @FindBy(xpath = "//*[@id='store_search_link']/img")
    private ExtendedWebElement searchBtn;

    public SteamHomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://store.steampowered.com/");
    }

    public boolean isSearchPresent() {
        return searchBox.isElementPresent();
    }

    public SearchedGamesPage searchGame(String game) {
        searchBox.type(game);
        searchBtn.click();
        return new SearchedGamesPage(getDriver());
    }


}
