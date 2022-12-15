package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.Menu;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.Products;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends AbstractPage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='All Products']")
    private ExtendedWebElement allProductsMessage;

    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    private Menu menu;

    @FindBy(xpath = "//*[@class='col-sm-9 padding-right']")
    private Products products;

    @Override
    public boolean isPageOpened() {
        return allProductsMessage.isElementPresent();
    }

    public Products getProducts() {
        return products;
    }

    public Menu getMenu() {
        return menu;
    }
}
