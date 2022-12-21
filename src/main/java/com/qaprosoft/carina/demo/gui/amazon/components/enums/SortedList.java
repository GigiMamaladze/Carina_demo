package com.qaprosoft.carina.demo.gui.amazon.components.enums;

public enum SortedList {
    LOWTOHIGH("Price: Low to High"), HIGHTTOLOW("Price: High to Low"), AVGCOSTUMERREVIEW("Avg. Customer Review"),
    NEWEST("Newest Arrivals");

    private String text;

    private SortedList(String text) {
        this.text = text;
    }

    public String getSort() {
        return text;
    }
}
