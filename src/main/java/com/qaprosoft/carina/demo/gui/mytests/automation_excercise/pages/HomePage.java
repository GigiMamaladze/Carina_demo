package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.Menu;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.Products;
import org.json.XML;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='logo pull-left']")
    private ExtendedWebElement logo;
    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    private Menu menu;

    @FindBy(xpath = "//*[@class ='left control-carousel hidden-xs']")
    private ExtendedWebElement bannerPageLeftSwiper;

    @FindBy(xpath = "//*[@class ='right control-carousel hidden-xs']")
    private ExtendedWebElement bannerPageRightSwiper;

    @FindBy(xpath = "//*[@class='col-sm-9 padding-right']")
    private Products products;

    public Products getProducts() {
        return products;
    }

    @Override
    public boolean isPageOpened() {
        return logo.isElementPresent();
    }

    public Menu getMenu() {
        return menu;
    }

    public void clickLeftSwiper() {
        bannerPageLeftSwiper.click();
    }

    public void clickRightSwiper() {
        bannerPageRightSwiper.click();
    }

}