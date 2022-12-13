package com.qaprosoft.carina.demo.gui.mytests.automation_excercise.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.mytests.automation_excercise.components.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='nav navbar-nav']")
    private Menu menu;

   @FindBy(xpath = "//*[@class='cart_quantity_delete']")
    private ExtendedWebElement xBtn;                   //remove btn

   public void clickXbtn(){
       xBtn.click();
   }

}
