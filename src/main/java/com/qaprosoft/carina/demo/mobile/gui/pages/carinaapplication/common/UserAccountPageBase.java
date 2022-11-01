package com.qaprosoft.carina.demo.mobile.gui.pages.carinaapplication.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class UserAccountPageBase extends AbstractPage {
    public UserAccountPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ContentFramePageBase clickContentFrame();

}
