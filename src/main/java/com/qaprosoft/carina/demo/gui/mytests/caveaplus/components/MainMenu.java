package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.interfaces.IMenuPages;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.CaveaPlusHomePage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.MoviesPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.TwShowsPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.WatchListPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainMenu extends AbstractUIObject implements IMenuPages {

    @FindBy(xpath = "//*[@id='main-navbar']/div[1]/div[2]/app-header-menu/ul/li")
    private List<ExtendedWebElement> menuPages;

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public MainMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


    @Override
    public CaveaPlusHomePage clickHome() {
        menuPages.get(0).click();
        return new CaveaPlusHomePage(getDriver());
    }

    @Override
    public MoviesPage clickMovie() {
        menuPages.get(1).click();
        return new MoviesPage(getDriver());
    }

    @Override
    public TwShowsPage clickTwShows() {
        menuPages.get(2).click();
        return new TwShowsPage(getDriver());
    }

    @Override
    public WatchListPage clickWatchList() {
        menuPages.get(3).click();
        return new WatchListPage(getDriver());
    }
}
