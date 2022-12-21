package com.qaprosoft.carina.demo.gui.caveaplus.components.enums;

public enum Languages {
    GEORGIA(" GEO "), ENGLISH(" ENG ");

    private String language;

    Languages(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
