package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class CameraAccessAlertBase extends AbstractMobilePageBase {
    public CameraAccessAlertBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isAlertPresent();

    public abstract void clickOkBtn();
}
