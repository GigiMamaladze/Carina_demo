package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class CheckoutOverviewScreenBase extends AbstractMobilePageBase {
    public CheckoutOverviewScreenBase(WebDriver driver) {
        super(driver);
    }


    public abstract CompleteScreenBase clickFinishBtn();
}
