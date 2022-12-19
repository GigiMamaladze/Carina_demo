package com.qaprosoft.carina.demo.mobile.gui.pages.mydemoapp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AbstractMobilePageBase extends AbstractPage {
    public AbstractMobilePageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isAppPageOpened() {
        throw new UnsupportedOperationException("'isOpened' method is not implemented.");
    }
}
