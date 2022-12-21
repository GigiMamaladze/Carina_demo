package com.qaprosoft.carina.demo.gui.steam.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContentAgePage extends AbstractPage {
    @FindBy(xpath = "//*[@id='ageDay']")
    private ExtendedWebElement ageDayList;

    @FindBy(xpath = "//*[@id='ageMonth']")
    private ExtendedWebElement ageMonthList;

    @FindBy(xpath = "//*[@id='ageYear']")
    private ExtendedWebElement ageYearList;

    @FindBy(xpath = "//*[@id='view_product_page_btn']")
    private ExtendedWebElement openPageBtn;


    public ContentAgePage(WebDriver driver) {
        super(driver);
    }

    public boolean isAgeDayListExsit() {
        return ageDayList.isElementPresent();
    }

    public boolean isAgeMonthListExsit() {
        return ageMonthList.isElementPresent();
    }

    public boolean isAgeYearListExsit() {
        return ageYearList.isElementPresent();
    }

    public boolean isOpenPageBtnExsit() {
        return openPageBtn.isElementPresent();
    }


    public ChosenGamePage writeContentAge() {
        ageDayList.select(27);
        ageMonthList.select(10);
        ageYearList.select(1);
        openPageBtn.click();
        return new ChosenGamePage(getDriver());
    }
}
