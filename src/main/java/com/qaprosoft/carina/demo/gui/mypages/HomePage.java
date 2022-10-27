package com.qaprosoft.carina.demo.gui.mypages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//a[@class='aJHbb dk90Ob jgXgSe HlqNPb' and text()='ChromeDriver']")
    private ExtendedWebElement chromeDriverBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://chromedriver.chromium.org/downloads");
    }

    public boolean isChromeDriverBtnPresent(){
        return chromeDriverBtn.isElementPresent();
    }


}
