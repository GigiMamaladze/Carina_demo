package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import org.openqa.selenium.WebDriver;

public abstract class DrawingScreenBase extends AbstractMobilePageBase{
    public DrawingScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isDraw(Direction direction,int duration);
}
