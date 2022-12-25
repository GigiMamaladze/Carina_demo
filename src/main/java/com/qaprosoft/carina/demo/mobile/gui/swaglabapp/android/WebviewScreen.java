package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.WebviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebviewScreenBase.class)
public class WebviewScreen extends WebviewScreenBase {
    public WebviewScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='WEBVIEW SELECTION']")
    private ExtendedWebElement webviewTitle;

    @FindBy(id = "test-enter a https url here...")
    private ExtendedWebElement urlTextField;

    @FindBy(id = "test-GO TO SITE")
    private ExtendedWebElement goToSiteBtn;

    @Override
    public boolean isOpened() {
        return webviewTitle.isElementPresent();
    }

    @Override
    public void typeUrl(String url) {
        urlTextField.type(url);
    }

    @Override
    public void clickGoToSiteBtn() {
        goToSiteBtn.click();
    }
}
