package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractMobilePageBase extends AbstractPage {
    public AbstractMobilePageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isScreenOpened() {
        throw new UnsupportedOperationException("'isAppPageOpened' method is not implemented.");
    }

    public boolean isProductPresentCart(String product) {
        throw new UnsupportedOperationException("'isProductPresentCart' method is not implemented.");
    }
}
