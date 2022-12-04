package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter.Countries;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter.Dubbing;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter.Genres;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class MovieAndTwShowFilter extends AbstractUIObject {
    @FindBy(xpath = "//button[text()=' Genres ']")
    private ExtendedWebElement genresListBox;

    @FindBy(xpath = "//a[text()='%s']")
    private ExtendedWebElement genre;

    @FindBy(xpath = "//button[text()=' Dubbing ']//span/i")
    private ExtendedWebElement dubbingListBox;

    @FindBy(xpath = "//a[text()='%s']")
    private ExtendedWebElement dubbing;

    @FindBy(xpath = "//button[text()=' Country ']")
    private ExtendedWebElement countryListBox;

    @FindBy(xpath = "//a[text()='%s']")
    private ExtendedWebElement country;

    @FindBy(xpath = "//checkbox//span[text() =' Free ']")
    private ExtendedWebElement checkBoxFree;

    @FindBy(xpath ="//checkbox//span[text() =' Premium ']")
    private ExtendedWebElement checkBoxPremium;

    @FindBy(xpath = "//span[text()=' Year released ']/../span[2]/span")
    private ExtendedWebElement yearReleasedDragBox;

    @FindBy(xpath = "//*[text()=' Year released ']/../div[2]/div/ngx-slider")
    private ExtendedWebElement yearReleaseSlider;



    public MovieAndTwShowFilter(WebDriver driver) {
        super(driver);
    }

    public MovieAndTwShowFilter(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void chooseGenre(Genres genres){
        genresListBox.click();
        genre.format(genres.getGenres()).click();
    }

    public void chooseDubbing(Dubbing dubbings){
        dubbingListBox.click();
        dubbing.format(dubbings.getDubbing()).click();
    }

    public void chooseCountry(Countries countries){
        countryListBox.click();
        country.format(countries.getCountry()).click();
    }

    public void clickCheckBoxFree(){
        checkBoxFree.click();
    }

    public void clickCheckBoxPremium(){
        checkBoxPremium.click();
    }

    public void chooseYearRealised(){
        yearReleasedDragBox.click();
    }



}
