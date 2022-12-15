package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.products.ProductsEnum;

public class Products extends AbstractUIObject {
    public Products(WebDriver driver) {
        super(driver);
    }

    public Products(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = "//*[text() ='%s']/ancestor::div[@class ='productinfo text-center'][1]")
    private ExtendedWebElement items;

    @FindBy(xpath = "//*[text()='%s']/../../div[@class='product-overlay']/div/a")
    private ExtendedWebElement addToCard;


    public boolean isItemPresent(String products) {
        return items.format(products).isElementPresent();
    }

    public void scrollToItem(String products) {
        items.format(products).scrollTo();
    }

    public void hoverItem(String products) {
        items.format(products).hover();
    }

    public AddedPopUpPage addToCard(String product) {
        addToCard.format(product).click();
        return new AddedPopUpPage(getDriver());
    }


}
