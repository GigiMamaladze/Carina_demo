package com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories;

public enum WomenSubCategories {
    DRESS("Dress"), TOPS("Tops"), SAREE("Saree");

    private String subCategories;

    WomenSubCategories(String subCategories) {
        this.subCategories = subCategories;
    }

    public String getSubCategories() {
        return subCategories;
    }
}
