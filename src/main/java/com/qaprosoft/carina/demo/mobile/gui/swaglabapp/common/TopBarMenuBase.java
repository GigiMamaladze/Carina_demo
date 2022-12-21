package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class TopBarMenuBase extends AbstractMobilePageBase {
    public TopBarMenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract CartScreenBase clickCartIconBtn();

    public abstract TopLeftMenuBase clickTopLeftMenuBtn();
}
