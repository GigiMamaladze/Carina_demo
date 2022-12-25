package com.qaprosoft.carina.demo.mobile.gui.swaglabapp.android;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.swaglabapp.common.DrawingScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DrawingScreenBase.class)
public class DrawingScreen extends DrawingScreenBase {
    public DrawingScreen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-DRAWING-SCREEN']//android.widget.TextView[@text = 'DRAWING']")
    private ExtendedWebElement drawScreenTitle;

    @FindBy(xpath = "*//android.view.View[@resource-id='signature-pad']//android.widget.Image")
    private ExtendedWebElement drawPanel;

    @Override
    public boolean isDraw(Direction direction, int duration) {
        return swipeInContainer(drawPanel, direction, duration);
    }

    @Override
    public boolean isOpened() {
        return drawScreenTitle.isElementPresent();
    }
}
