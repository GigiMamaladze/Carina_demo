package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.Menu;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.Product;
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

    @FindBy(xpath = "//div[@class='features_items']")
    private Product productList;

    @Override
    public boolean isPageOpened() {
        return allProductsMessage.isElementPresent();
    }

    public Product getProducts() {
        return productList;
    }

    public Menu getMenu() {
        return menu;
    }
}
