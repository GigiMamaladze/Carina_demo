package com.qaprosoft.carina.demo.gui.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.automation_excercise.components.CategoriesMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories.KidsSubCategory;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories.MenSubCategories;
import com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories.WomenSubCategories;

public class CategoryItemPage extends AbstractPage {
    public CategoryItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='features_items']/h2[contains(text(),'%s')]")
    private ExtendedWebElement categoryPageInfo;

    @FindBy(xpath = "//*[@class='panel-group category-products']")
    private CategoriesMenu categoriesMenu;

    public boolean isWomanCategoriesItemPageOpened(WomenSubCategories womenSubCategories) {
        return categoryPageInfo.format(womenSubCategories.getSubCategories()).isElementPresent();
    }

    public boolean isMenCategoriesItemPageOpened(MenSubCategories menSubCategories) {
        return categoryPageInfo.format(menSubCategories.getSubCategories()).isElementPresent();
    }

    public boolean isKidsCategoriesPageOpened(KidsSubCategory kidsSubCategory) {
        return categoryPageInfo.format(kidsSubCategory.getSubCategory()).isElementPresent();
    }

    public CategoriesMenu getCategoriesMenu() {
        return categoriesMenu;
    }
}
