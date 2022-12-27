package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class CameraAccessScreenBase extends AbstractMobilePageBase {
    public CameraAccessScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isAlertPresent();

    public abstract void clickOkBtn();
}
