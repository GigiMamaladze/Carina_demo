package com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.CompleteScreenBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.swaglabapp.common.OverviewScreenBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = OverviewScreenBase.class)
public class OverviewScreen extends OverviewScreenBase {
    public OverviewScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Description']/android.widget.TextView[contains(@text,'%s')]")
    private ExtendedWebElement productName;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'CHECKOUT: OVERVIEW')]")
    private ExtendedWebElement titleOfOverviewScreen;

    @FindBy(id = "test-FINISH")
    private ExtendedWebElement finishBtn;

    @Override
    public boolean isScreenOpened() {
        return titleOfOverviewScreen.isElementPresent();
    }

    @Override
    public boolean isProductPresentCart(String product) {
        return productName.format(product).isElementPresent();
    }

    @Override
    public void scrollToFinishBtn() {
        finishBtn.scrollTo();
    }

    @Override
    public CompleteScreenBase clickFinishBtn() {
        finishBtn.click();
        return initPage(getDriver(), CompleteScreenBase.class);
    }
}
