package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class TopBarMenuBase extends AbstractMobilePageBase {
    public TopBarMenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract CartScreenBase clickOnCartIconBtn();

    public abstract TopLeftMenuBase clickOnTopLeftMenuBtn();
}
