package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter;

public enum Genres {
    HORROR(" Horror "),ADVENTURE(" Adventure "),COMEDY(" Comedy "),DRAMA(" Drama "),DETECTIVE(" Detective "),
    DOCUMENTARY(" Documentary "), WESTERN(" Western "), CRIME(" Crime "), FICTION(" Fiction "), SCI_FI(" Sci-Fi "),
    MUSICAL(" Musical "), THRILLER(" Thriller "), FANTASY(" Fantasy "), ROMANCE(" Romance "), ACTION(" Action "),
    SHORT(" Short "), SPORT(" Sport "), BIOGRAPHY(" Biography "), WAR(" War "), HISTORY(" History "),MUSIC(" Music "),
    TALK_SHOW(" Talk-Show "), BLACK_COMEDY(" Black Comedy "), SUPERHERO(" Superhero "),KIDS_AND_FAMILY(" Kids & Family "),
    MYSTERY(" Mystery "),ADULT_ANIMATION(" Adult Animation ");

    private String genres;

    Genres(String genres) {
        this.genres = genres;
    }

    public String getGenres() {
        return genres;
    }
}
