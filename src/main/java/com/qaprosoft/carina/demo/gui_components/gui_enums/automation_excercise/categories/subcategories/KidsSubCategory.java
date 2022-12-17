package com.qaprosoft.carina.demo.gui_enums.automation_excercise.categories.subcategories;

public enum KidsSubCategory {
    DRESS("Dress"), TOPSANDSHIRTS("Tops & Shirts");

    private String subCategory;

    KidsSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }
}
