package com.qaprosoft.carina.demo.gui.mytests.cavea.components.interfaces;

import com.qaprosoft.carina.demo.gui.mytests.cavea.pages.CaveaPlusHomePage;
import com.qaprosoft.carina.demo.gui.mytests.cavea.pages.MoviesPage;
import com.qaprosoft.carina.demo.gui.mytests.cavea.pages.TwShowsPage;
import com.qaprosoft.carina.demo.gui.mytests.cavea.pages.WatchListPage;
import org.openqa.selenium.support.FindBy;

public interface IMenuPages{
   CaveaPlusHomePage clickHome();
   MoviesPage clickMovie();

   TwShowsPage clickTwShows();

   WatchListPage clickWatchList();
}
