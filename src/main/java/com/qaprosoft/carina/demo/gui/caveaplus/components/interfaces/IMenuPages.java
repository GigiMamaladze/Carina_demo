package com.qaprosoft.carina.demo.gui.caveaplus.components.interfaces;

import com.qaprosoft.carina.demo.gui.caveaplus.pages.CaveaPlusHomePage;
import com.qaprosoft.carina.demo.gui.caveaplus.pages.MoviesPage;
import com.qaprosoft.carina.demo.gui.caveaplus.pages.TwShowsPage;
import com.qaprosoft.carina.demo.gui.caveaplus.pages.WatchListPage;

public interface IMenuPages {
    CaveaPlusHomePage clickHome();

    MoviesPage clickMovie();

    TwShowsPage clickTwShows();

    WatchListPage clickWatchList();
}
