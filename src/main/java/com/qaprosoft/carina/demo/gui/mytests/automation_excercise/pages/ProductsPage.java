package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.AddedPopUpPage;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends AbstractPage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@class='features_items']/*[@class='col-sm-4']")
    private List<ExtendedWebElement> items;

    @FindBy(xpath = "//*[@class='features_items']/*[@class='col-sm-4']//*[text()='Add to cart']")
    private List<ExtendedWebElement> addToCard;

    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    private Menu menu;

    public AddedPopUpPage addToCard(){
            items.get(0).scrollTo();
            items.get(0).hover();
            addToCard.get(1).click();
            pause(1);
            return new AddedPopUpPage(getDriver());

    }

    public Menu getMenu() {
        return menu;
    }
}
