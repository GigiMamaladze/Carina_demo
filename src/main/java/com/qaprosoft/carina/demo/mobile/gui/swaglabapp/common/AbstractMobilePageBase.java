package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractMobilePageBase extends AbstractPage implements IMobileUtils {
    public AbstractMobilePageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        throw new UnsupportedOperationException("'isOpened' method is not implemented.");
    }

    public boolean isProductPresent(String product) {
        throw new UnsupportedOperationException("'isProductPresentCart' method is not implemented.");
    }

    public boolean isProductPresent(String product, String imagine) {
        throw new UnsupportedOperationException("'isProductPresentCart' method is not implemented.");
    }


}
