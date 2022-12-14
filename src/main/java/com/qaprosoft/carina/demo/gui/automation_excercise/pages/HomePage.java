package com.qaprosoft.carina.demo.gui.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.automation_excercise.components.BrandsMenu;
import com.qaprosoft.carina.demo.gui.automation_excercise.components.CategoriesMenu;
import com.qaprosoft.carina.demo.gui.automation_excercise.components.Menu;
import com.qaprosoft.carina.demo.gui.automation_excercise.components.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "//*[@class='carousel-inner']/div[contains(@class, item)][%d]")
    private ExtendedWebElement banners;
    @FindBy(xpath = "//*[@class ='right control-carousel hidden-xs']")
    private ExtendedWebElement bannerPageRightSwiper;

    @FindBy(xpath = "//*[@class='col-sm-9 padding-right']")
    private Product product;

    @FindBy(xpath = "//*[@class='panel-group category-products']")
    private CategoriesMenu categoriesMenu;

    @FindBy(xpath = "//*[@class='brands-name']")
    private BrandsMenu brandsMenu;

    public CategoriesMenu getCategoriesMenu() {
        return categoriesMenu;
    }

    public BrandsMenu getBrandsMenu() {
        return brandsMenu;
    }

    public boolean isBannerChanged(int i) {
        return banners.format(i).isVisible();
    }

    public Product getProducts() {
        return product;
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
