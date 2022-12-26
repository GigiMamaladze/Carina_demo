package com.qaprosoft.carina.demo.gui_components.automation_excercise.enums.categories;

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
