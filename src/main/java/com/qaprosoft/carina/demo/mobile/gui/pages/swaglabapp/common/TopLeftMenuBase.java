package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class TopLeftMenuBase extends AbstractMobilePageBase {
    public TopLeftMenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract SwagLabsLogInScreenBase clickLogoutBtn();
}
