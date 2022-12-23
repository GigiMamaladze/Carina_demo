package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class QrCodeScreenBase extends AbstractMobilePageBase{
    public QrCodeScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isAlertPresent();

    public abstract void handleAlert();

}
