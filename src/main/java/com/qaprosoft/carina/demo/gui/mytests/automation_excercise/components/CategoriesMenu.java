package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages.CategoryItemPage;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.Categories;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories.KidsSubCategory;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories.MenSubCategories;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories.WomenSubCategories;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CategoriesMenu extends AbstractUIObject {
    private Categories categories;

    public CategoriesMenu(WebDriver driver) {
        super(driver);
    }

    public CategoriesMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = "//*[@id ='%s']/..//span[contains(@class,'badge pull-right')]")
    private ExtendedWebElement categoriesList;

    @FindBy(xpath = "//*[@id ='Women']/div[contains(@class,panel-body)]//a[contains(text(),'%s')]")
    private ExtendedWebElement womenSubCategoriesList;

    @FindBy(xpath = "//*[@id ='Men']/div[contains(@class,panel-body)]//a[contains(text(),'%s')]")
    private ExtendedWebElement menSubCategoriesList;

    @FindBy(xpath = "//*[@id ='Kids']/div[contains(@class,panel-body)]//a[contains(text(),'%s')]")
    private ExtendedWebElement kidsSubCategoriesList;

    public void scrollToCategoriesList(Categories categories) {
        categoriesList.format(categories.getCategory()).scrollTo();
    }


    public void clickOnCategory(Categories category) {
        categoriesList.format(category.getCategory()).click();
    }

    public CategoryItemPage clickWomenSubCategory(WomenSubCategories womenSubCategories) {
        womenSubCategoriesList.format(womenSubCategories.getSubCategories()).click();
        return new CategoryItemPage(getDriver());
    }

    public CategoryItemPage clickMenSubCategory(MenSubCategories menSubCategories) {
        menSubCategoriesList.format(menSubCategories.getSubCategories()).click();
        return new CategoryItemPage(getDriver());
    }

    public CategoryItemPage clickKidsSubCategory(KidsSubCategory kidsSubCategory) {
        kidsSubCategoriesList.format(kidsSubCategory.getSubCategory()).click();
        return new CategoryItemPage(getDriver());
    }


}
