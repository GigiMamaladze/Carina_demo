package com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories;

public enum Categories {
    WOMEN("Women"), MEN("Men"), KID("Kids");

    public String category;

    Categories(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
