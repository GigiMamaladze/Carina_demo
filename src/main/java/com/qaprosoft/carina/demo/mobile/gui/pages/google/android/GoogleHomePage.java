package com.qaprosoft.carina.demo.mobile.gui.pages.google.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.google.common.GoogleHomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = GoogleHomePageBase.class)
public class GoogleHomePage extends GoogleHomePageBase {

    @FindBy(id ="search_box_text")
    private ExtendedWebElement searchBoxl;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isSearchBoxExsit(){

        return searchBoxl.isElementPresent();
    }

    @Override
    public void tapSomething(String something) {
        searchBoxl.type(something);
    }
}
