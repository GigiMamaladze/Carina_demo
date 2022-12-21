package com.qaprosoft.carina.demo.gui.amazon.components.enums;

public enum Seller {
    AMAZON("Amazon.com"), ROKSELECTRONIC("ROKC Electronics");

    private String text;

    Seller(String text) {
        this.text = text;
    }


    public String getSeller() {
        return text;
    }
}
