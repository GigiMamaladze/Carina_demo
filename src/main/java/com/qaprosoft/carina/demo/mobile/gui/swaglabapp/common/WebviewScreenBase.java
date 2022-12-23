package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class WebviewScreenBase extends AbstractMobilePageBase{
    public WebviewScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUrl(String url);

    public abstract void clickGoToSiteBtn();
}
