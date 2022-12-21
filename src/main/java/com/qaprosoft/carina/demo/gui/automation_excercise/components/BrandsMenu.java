package com.qaprosoft.carina.demo.gui.automation_excercise.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.automation_excercise.pages.BrandPage;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.Brands;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BrandsMenu extends AbstractUIObject {
    public BrandsMenu(WebDriver driver) {
        super(driver);
    }

    public BrandsMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = "//*[@class='brands-name']//a[text()='%s']")
    private ExtendedWebElement brandList;


    public void scrollToBrand(Brands brands) {
        brandList.format(brands.getBrand()).scrollTo();
    }

    public BrandPage clickBrands(Brands brands) {
        brandList.format(brands.getBrand()).click();
        return new BrandPage(getDriver());
    }


}
