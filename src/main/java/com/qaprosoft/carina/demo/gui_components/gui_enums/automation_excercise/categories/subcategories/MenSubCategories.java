package com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories;

public enum MenSubCategories {
    TSHIRTS("Tshirts "), JEANS("Jeans ");

    private String subCategories;

    MenSubCategories(String subCategories) {
        this.subCategories = subCategories;
    }

    public String getSubCategories() {
        return subCategories;
    }
}
