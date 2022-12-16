package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.CategoriesMenu;
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

    @FindBy(xpath = "//*[@id='search_product']")
    private ExtendedWebElement searchTextField;

    @FindBy(xpath = "//*[@id='submit_search']")
    private ExtendedWebElement searchButtonIcon;

    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    private Menu menu;

    @FindBy(xpath = "//div[@class='features_items']")
    private Product productList;

    @FindBy(xpath = "//*[@class='panel-group category-products']")
    private CategoriesMenu categoriesMenu;


    @Override
    public boolean isPageOpened() {
        return allProductsMessage.isElementPresent();
    }

    public CategoriesMenu getCategoriesMenu() {
        return categoriesMenu;
    }

    public Product getProducts() {
        return productList;
    }

    public void typeProduct(String product) {
        searchTextField.type(product);
    }

    public void clickSearchBtnIcon() {
        searchButtonIcon.click();
    }

    public Menu getMenu() {
        return menu;
    }
}
