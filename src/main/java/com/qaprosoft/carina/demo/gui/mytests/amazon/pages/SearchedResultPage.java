package com.qaprosoft.carina.demo.gui.mytests.amazon.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.amazon.components.enums.Brands;
import com.qaprosoft.carina.demo.gui.mytests.amazon.components.enums.Seller;
import com.qaprosoft.carina.demo.gui.mytests.amazon.components.enums.SortedList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchedResultPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span")
    private ExtendedWebElement resultHeader;
    //Sorted
//    @FindBy(xpath = "//*[@id='a-autoid-0-announce']/span[2]")
//    private ExtendedWebElement sortedList;

    @ExtendedFindBy(text ="%s")
    private ExtendedWebElement sortedList;


    @FindBy(xpath = "//*[@id='s-result-sort-select_1']")
    private ExtendedWebElement priceLowToHigh;

    @FindBy(xpath = "//*[@id='s-result-sort-select_2']")
    private ExtendedWebElement priceHighToLow;

    @FindBy(xpath = "//*[@id='s-result-sort-select_3']")
    private ExtendedWebElement avgCostumerReview;

    @FindBy(xpath = "//*[@id='s-result-sort-select_4']")
    private ExtendedWebElement newestArrivals;
   //-----

    //Brands
    @FindBy(xpath = "//*[@id='p_89/SAMSUNG']/span/a/div/label/i")
    private ExtendedWebElement samsungCheckBox;

    @FindBy(xpath = "//*[@id='p_89/Lenovo']/span/a/span")
    private ExtendedWebElement lenovoCheckBox;

    @FindBy(xpath = "//*[@id='p_89/Acer']/span/a/div/label/i")
    private ExtendedWebElement acerCheckBox;

    @FindBy(xpath = "//*[@id='p_89/HP']/span/a/div/label/i")
    private ExtendedWebElement hpCheckBox;

    @FindBy(xpath = "//*[@id='p_89/ASUS']/span/a/div/label/i")
    private ExtendedWebElement asusCheckBox;

    @FindBy(xpath = "//*[@id='p_89/Microsoft']/span/a/div/label/i")
    private ExtendedWebElement microsoftCheckBox;

    @FindBy(xpath = "//*[@id='p_89/iBUYPOWER']/span/a/div/label/i")
    private ExtendedWebElement iBuyCheckBox;
    //---

    //Seller
    @FindBy(xpath = "//*[@id='p_6/ATVPDKIKX0DER']/span/a/span")
    private ExtendedWebElement amazonCheckBox;

    @FindBy(xpath = "//*[@id='p_6/A3JUY24V3YM6Q0']/span/a/span")
    private ExtendedWebElement iaatCheckBox;

    public SearchedResultPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return resultHeader.isElementPresent();
    }

    public void chooseSortProcess(SortedList by){

        switch (by) {
            case LOWTOHIGH:
                sortedList.format("Price: Low to High").click();
                break;
//            case HIGHTOLOW:
//                priceHighToLow.click();
//                break;
//            case AVGCOSTUMEREVIEW:
//                avgCostumerReview.click();
//                break;
//            case NEWARRIVALS:
//                newestArrivals.click();
//                break;
        }
    }
    public void chooseBrands(Brands brands){
        switch (brands){
            case SAMSUNG:
                samsungCheckBox.click();
                break;
            case LENOVO:
                lenovoCheckBox.click();
                break;
            case ACER:
                acerCheckBox.click();
                break;
            case ASUS:
                asusCheckBox.click();
                break;
            case MICROSOFT:
                microsoftCheckBox.click();
                break;
            case HP:
                hpCheckBox.click();
                break;
            case iBUYPOWER:
                iBuyCheckBox.click();
                break;
        }
    }

    public void chooseSeller(Seller seller){
        switch (seller){
            case AMAZON:
                amazonCheckBox.click();
                break;
            case IAAT:
                iaatCheckBox.click();
                break;
        }
    }

}
