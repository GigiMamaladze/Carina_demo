package com.qaprosoft.carina.demo.gui.amazon.components.enums;

public enum Brands {
    SAMSUNG("SAMSUNG"), ASUS("ASUS"), LENOVO("Lenovo"), ACER("Acer"), HP("HP"),
    MICROSOFT("Microsoft"), iBUYPOWER("iBUYPOWER");

    private String text;

    Brands(String text) {
        this.text = text;
    }

    public String getBrand() {
        return text;
    }
}
