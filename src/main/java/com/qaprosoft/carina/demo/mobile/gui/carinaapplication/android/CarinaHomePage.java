package com.qaprosoft.carina.demo.mobile.gui.carinaapplication.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.CarinaHomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.RegirtrationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CarinaHomePageBase.class)
public class CarinaHomePage extends CarinaHomePageBase {
    @FindBy(id = "next_button")
    private ExtendedWebElement nextBtn;

    public CarinaHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return nextBtn.isElementPresent();
    }

    @Override
    public RegirtrationPageBase clickNextBtn() {
        nextBtn.click();
        return initPage(getDriver(), RegirtrationPageBase.class);
    }
}
