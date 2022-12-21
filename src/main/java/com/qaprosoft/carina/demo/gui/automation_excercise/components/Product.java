package com.qaprosoft.carina.demo.gui.automation_excercise.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.automation_excercise.pages.ProductDetailsPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Product extends AbstractUIObject {
    public Product(WebDriver driver) {
        super(driver);
    }

    public Product(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = "//*[text() ='%s']/ancestor::div[@class ='productinfo text-center'][1]")
    private ExtendedWebElement items;

    @FindBy(xpath = "//*[text()='%s']/../../div[@class='product-overlay']/div//a[contains(@class, 'add-to-cart')]")
    private ExtendedWebElement addToCard;

    @FindBy(xpath = "//*[text()='View Product']")
    private ExtendedWebElement viewProductBtn;


    public boolean isItemPresent(String product) {
        return items.format(product).isElementPresent();
    }

    public void scrollToItem(String product) {
        items.format(product).scrollTo();
    }

    public void hoverItem(String product) {
        items.format(product).hover();
    }

    public AddedProductPopup addToCard(String product) {
        addToCard.format(product).click();
        return new AddedProductPopup(getDriver());
    }

    public ProductDetailsPage clickOnViewProductButton() {
        viewProductBtn.click();
        return new ProductDetailsPage(getDriver());
    }


}
