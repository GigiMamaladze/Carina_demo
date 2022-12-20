package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class OverviewScreenBase extends AbstractMobilePageBase {
    public OverviewScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void scrollToFinishBtn();

    public abstract CompleteScreenBase clickFinishBtn();
}
