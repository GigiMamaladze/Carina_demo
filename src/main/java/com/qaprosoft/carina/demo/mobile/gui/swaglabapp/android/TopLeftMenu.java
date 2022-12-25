package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = TopLeftMenuBase.class)
public class TopLeftMenu extends TopLeftMenuBase {
    public TopLeftMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGOUT']")
    private ExtendedWebElement logoutBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-ALL ITEMS']")
    private ExtendedWebElement aboutBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-WEBVIEW']")
    private ExtendedWebElement webViewBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-QR CODE SCANNER']")
    private ExtendedWebElement qrCodeScannerBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-DRAWING']")
    private ExtendedWebElement drawingBtn;

    @Override
    public SwagLabsLogInScreenBase clickLogoutBtn() {
        logoutBtn.click();
        return initPage(getDriver(), SwagLabsLogInScreenBase.class);
    }

    @Override
    public WebviewScreenBase clickWebviewBtn() {
        webViewBtn.click();
        return initPage(getDriver(), WebviewScreenBase.class);
    }

    @Override
    public QrCodeScreenBase clickQrCodeScannerBtn() {
        qrCodeScannerBtn.click();
        return initPage(getDriver(), QrCodeScreenBase.class);
    }

    @Override
    public AboutWebScreenBase clickAboutBtn() {
        aboutBtn.click();
        return initPage(getDriver(), AboutWebScreenBase.class);
    }

    @Override
    public DrawingScreenBase clickDrawingBtn() {
        drawingBtn.click();
        return initPage(getDriver(), DrawingScreenBase.class);
    }
}
