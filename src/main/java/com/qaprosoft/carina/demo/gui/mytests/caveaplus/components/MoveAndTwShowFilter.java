package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.Genres;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MoveAndTwShowFilter extends AbstractUIObject {
    @FindBy(xpath = "//app-movies//section[1]/div//div//div")
    private ExtendedWebElement genresListBox;

    @FindBy(xpath = "//a[text()='%s']")
    private ExtendedWebElement genresList;

    public MoveAndTwShowFilter(WebDriver driver) {
        super(driver);
    }

    public MoveAndTwShowFilter(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void chooseGenre(Genres genre){
        genresListBox.click();
        genresList.format(genre.getGenres()).click();
    }

}
