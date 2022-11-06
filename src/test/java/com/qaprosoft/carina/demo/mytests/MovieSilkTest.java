package com.qaprosoft.carina.demo.mytests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.mytests.movies_silk.MoviesSilkHomePage;
import com.qaprosoft.carina.demo.gui.mytests.movies_silk.SearchedMoviePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MovieSilkTest extends AbstractTest {
    @Test
    public void testSearchedGame(){
        MoviesSilkHomePage moviesSilkHomePage = new MoviesSilkHomePage(getDriver());
        moviesSilkHomePage.open();
        Assert.assertTrue(moviesSilkHomePage.isPageOpened(),"Page is not Opened");
        SearchedMoviePage searchedMoviePage = moviesSilkHomePage.searchMovie("The Batman");
        Assert.assertTrue(searchedMoviePage.isPageOpened());
        pause(3);
    }

    @Test
    public void clickNextAndBackBtn(){
        MoviesSilkHomePage moviesSilkHomePage = new MoviesSilkHomePage(getDriver());
        moviesSilkHomePage.open();
        Assert.assertTrue(moviesSilkHomePage.isPageOpened(),"Page is not Opened");
        moviesSilkHomePage.clickNextBtn();
    }

}
