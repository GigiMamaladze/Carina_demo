package com.qaprosoft.carina.demo.gui.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.amazon.components.enums.Brands;
import com.qaprosoft.carina.demo.gui.amazon.components.enums.Seller;
import com.qaprosoft.carina.demo.gui.amazon.components.enums.SortedList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchedResultPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span")
    private ExtendedWebElement resultHeader;
    @FindBy(xpath = "//*[@id='a-autoid-0-announce']/span[2]")
    private ExtendedWebElement sortedListBtn;
    @FindBy(xpath = "//a[text()='%s']")
    private ExtendedWebElement sortedList;
    @FindBy(xpath = "//span[text()='%s']")
    private ExtendedWebElement brandList;

    @FindBy(xpath = "//span[text()='%s']")
    private ExtendedWebElement sellerList;


    public SearchedResultPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return resultHeader.isElementPresent();
    }

    public void chooseSortProcess(SortedList by) {
        sortedListBtn.click();
        sortedList.format(by.getSort()).click();
    }

    public void chooseBrands(Brands brands) {
        brandList.format(brands.getBrand()).click();
    }

    public void chooseSeller(Seller seller) {
        sellerList.format(seller.getSeller()).click();
    }

}
