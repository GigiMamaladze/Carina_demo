package com.qaprosoft.carina.demo.gui.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends AbstractPage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='%s']")
    private ExtendedWebElement productName;

    @FindBy(xpath = "//*[@class='product-information']")
    private ExtendedWebElement productsDetails;


    public boolean isProductDetailsPageOpened(String product) {
        return productName.format(product).isElementPresent() && productsDetails.isElementPresent();
    }
}
