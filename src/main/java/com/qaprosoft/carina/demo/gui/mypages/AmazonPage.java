package com.qaprosoft.carina.demo.gui.mypages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends AbstractPage {

    @FindBy(xpath = "//*[@data-csa-c-content-id='nav_cs_gb']")
    private ExtendedWebElement todayBtn;

    public AmazonPage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.amazon.com/");
    }

    public boolean isTodayBtnPresent(){
        return todayBtn.isElementPresent();
    }

}
