package com.qaprosoft.carina.demo.mobile.gui.pages.google.common;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class GoogleHomePageBase extends AbstractPage {

    public GoogleHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void tapSomething(String something);
}
