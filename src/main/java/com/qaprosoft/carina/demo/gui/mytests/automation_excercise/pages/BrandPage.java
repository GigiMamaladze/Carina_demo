package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.Brands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BrandPage extends AbstractPage {
    public BrandPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='features_items']/h2[contains(text(),'Brand - %s Products')]")
    private ExtendedWebElement brandInfo;


    public boolean isBrandPageOpened(Brands brands) {
        return brandInfo.format(brands.getBrand()).isElementPresent();
    }


}
