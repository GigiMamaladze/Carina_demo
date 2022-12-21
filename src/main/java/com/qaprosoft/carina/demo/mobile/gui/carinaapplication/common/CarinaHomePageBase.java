package com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaHomePageBase extends AbstractPage {

    public CarinaHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract RegirtrationPageBase clickNextBtn();
}
