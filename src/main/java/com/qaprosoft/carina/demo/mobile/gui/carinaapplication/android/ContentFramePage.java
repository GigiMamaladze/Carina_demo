package com.qaprosoft.carina.demo.mobile.gui.carinaapplication.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.carinaapplication.common.ContentFramePageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ContentFramePageBase.class)
public class ContentFramePage extends ContentFramePageBase {
    public ContentFramePage(WebDriver driver) {
        super(driver);
    }
}
