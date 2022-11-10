package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.interfaces;

import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.CaveaPlusHomePage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.MoviesPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.TwShowsPage;
import com.qaprosoft.carina.demo.gui.mytests.caveaplus.pages.WatchListPage;

public interface IMenuPages{
   CaveaPlusHomePage clickHome();
   MoviesPage clickMovie();

   TwShowsPage clickTwShows();

   WatchListPage clickWatchList();
}
