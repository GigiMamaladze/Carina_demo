package com.qaprosoft.carina.demo.mobile.gui.pages.mydemoapp.common;

import org.openqa.selenium.WebDriver;

public abstract class SwagLabsLogInPageBase extends AbstractMobilePageBase {
    public SwagLabsLogInPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUserName(String userName);

}
