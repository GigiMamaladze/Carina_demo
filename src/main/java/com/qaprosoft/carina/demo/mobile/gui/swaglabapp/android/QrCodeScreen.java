package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.QrCodeScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = QrCodeScreenBase.class)
public class QrCodeScreen extends QrCodeScreenBase {
    public QrCodeScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text ='Scan a QR Code that contains a url.']//ancestor::*[1]")
    private ExtendedWebElement message;


    @Override
    public boolean isOpened() {
        return message.isElementPresent();
    }
}
