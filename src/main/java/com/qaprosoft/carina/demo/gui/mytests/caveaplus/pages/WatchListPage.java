package com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.interfaces.IMenuPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WatchListPage extends AbstractPage implements IMenuPages {

    public WatchListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='main-navbar']/div[1]/div[2]/app-header-menu/ul/li")
    private List<ExtendedWebElement> menuPage;




    @Override
    public CaveaPlusHomePage clickHome() {
        menuPage.get(0).click();
        return new CaveaPlusHomePage(getDriver());
    }

    @Override
    public MoviesPage clickMovie() {
        menuPage.get(1).click();
        return new MoviesPage(getDriver());
    }

    @Override
    public TwShowsPage clickTwShows() {
        menuPage.get(2).click();
        return new TwShowsPage(getDriver());
    }

    @Override
    public WatchListPage clickWatchList() {
        menuPage.get(3).click();
        return new WatchListPage(getDriver());
    }
}
