package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class AllertScreenBase extends AbstractMobilePageBase {
    public AllertScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isAllertPresent();

    public abstract void clickAllowBtn();
}
