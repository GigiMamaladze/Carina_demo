package com.qaprosoft.carina.demo.gui.mytests.netflix;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NetflixHomePage extends AbstractPage {
    @FindBy(xpath ="//*[@id='faq']/div[1]/h1")
    private ExtendedWebElement messege;

    @FindBy(xpath = "//*[@class='faq-list']/li")
    private List<ExtendedWebElement> questionList;

    public NetflixHomePage(WebDriver driver) {
        super(driver);
    }


    public boolean isPageOpened() {
        return messege.isElementPresent();
    }


    public void getAllQuestions(){
        for (int i = 0; i < questionList.size() ; i++) {
            System.out.println(questionList.get(i).getText());
        }
    }




}
