package com.qaprosoft.carina.demo.gui.steam.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchedGamesPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='search_resultsRows']/a[1]/div[1]/img")
    private ExtendedWebElement game;

    public SearchedGamesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isGamePresent() {
        return game.isElementPresent();
    }

    public ChosenGamePage clickSearchedGame() {
        game.click();
        return new ChosenGamePage(getDriver());
    }

    public ContentAgePage clickSearchedContentAgeGame() {
        game.click();
        return new ContentAgePage(getDriver());
    }


}
