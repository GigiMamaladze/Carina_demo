package com.qaprosoft.carina.demo.gui_components.automation_excercise.enums.categories.subcategories;

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
