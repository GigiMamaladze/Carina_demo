package com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.MainMenu;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.Languages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CaveaPlusHomePage extends AbstractPage{

    @FindBy(xpath = "//*[@id='main-navbar']/div[1]/div[1]/a/span")
    private ExtendedWebElement caveaLogo;

    public CaveaPlusHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='right-nav']/li[1]/app-language-switcher/dropdown[1]/div/button")
    private ExtendedWebElement languageBtn;

    @FindBy(xpath = "//a[text() = '%s']")
    private ExtendedWebElement languageList;

    @FindBy(xpath = "//*[swiper]")
    private List<ExtendedWebElement> swiperSize;
    @FindBy(xpath = "//*[@class='container-cavea']/app-home-blocks/app-default-block[%s]/section/div[2]/swiper/div[%d]")
    private ExtendedWebElement swiper;

    @FindBy(xpath = "//*[@class ='stars ng-tns-c61-1']/div")
    private List<ExtendedWebElement> bannerPage;

    @FindBy(xpath = "//*[@class='nav header-menu ng-star-inserted']")
    private MainMenu mainMenu;

    @FindBy(xpath = "//*[@id='right-nav']/li[2]/a")
    private ExtendedWebElement logInBtn;

    @FindBy(xpath = "//*[@id='right-nav']/li[3]/a")
    private ExtendedWebElement registrationBtn;

    @Override
    public boolean isPageOpened() {
        return caveaLogo.isElementPresent();
    }



    public void changeLanguage(Languages languages){
        languageBtn.click();
        languageList.format(languages.getLanguage()).click();
    }

    public void swipeMovies() {
        for (int i = 1; i <=swiperSize.size(); i++) {;
            for (int j =1; j<=2;j++) {
                swiper.format(i, j).scrollTo();
                pause(0.25);
                swiper.format(i,j).click();
            }
        }
    }

    public void switchBannerPage(){
        for (int i = 1; i < bannerPage.size(); i++) {
            bannerPage.get(i).click();
        }
    }

    public LogInPage clickLogInBtn(){
        logInBtn.click();
        return new LogInPage(getDriver());
    }

    public RegistrationPage clickRegistrationBtn(){
        registrationBtn.click();
        return new RegistrationPage(getDriver());
    }
    public MainMenu getMainMenu() {
        return mainMenu;
    }
}
