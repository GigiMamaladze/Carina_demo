package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractMobilePageBase extends AbstractPage implements IMobileUtils {
    public AbstractMobilePageBase(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        throw new UnsupportedOperationException("'isOpened' method is not implemented.");
    }

    public boolean isProductPresentCart(String product) {
        throw new UnsupportedOperationException("'isProductPresentCart' method is not implemented.");
    }


}
