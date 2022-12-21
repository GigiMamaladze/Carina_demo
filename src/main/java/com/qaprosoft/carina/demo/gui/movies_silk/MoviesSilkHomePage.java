package com.qaprosoft.carina.demo.gui.movies_silk;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MoviesSilkHomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id='root']/div/header/nav/a/div/img")
    private ExtendedWebElement moviesLogo;

    @FindBy(xpath = "//*[@id='root']/div/header/nav/div[1]/input")
    private ExtendedWebElement searchTextBox;

    @FindBy(xpath = "//*[@id='root']/div/div[1]/a[1]/div")
    private ExtendedWebElement searchedMovie;


    //    @ExtendedFindBy(accessibilityId ="%s")
    @FindBy(id = "prev-1")
    private ExtendedWebElement previousBtn;


    public MoviesSilkHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return moviesLogo.isElementPresent();
    }

    public SearchedMoviePage searchMovie(String movie) {
        searchTextBox.type(movie);
        searchedMovie.click();
        return new SearchedMoviePage(getDriver());
    }

    public void clickNextBtn() {
        previousBtn.click();
    }
}
