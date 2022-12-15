package com.qaprosoft.carina.demo.gui_enums.automation_excercise.products;

public enum ProductsEnum {
    BLUE_TOP("Blue Top"), MEN_TSHIRT("Men Tshirt"), SLEEVELESS_DRESS("Sleeveless Dress"),
    STYLISH_DREES("Stylish Dress"), WINTER_TOP("Winter Top"), SUMMER_WHITE_TOP("Summer White Top"),
    MADAME_TOP_FOR_WOMAN("Madame Top For Women"), FANCY_GREEN("Fancy Green Top"), SLEEVES_PRINTED_TOP_WHITE("Sleeves Printed Top - White"),
    HALF_SLEEVES_TOP_SCHIFFLI_DETAILING_PINK("Half Sleeves Top Schiffli Detailing - Pink"), FROZE_TOPS_FOR_KIDS("Frozen Tops For Kids"),
    FULL_SLEEVES_TOP_CHERRY_PINK("Full Sleeves Top Cherry - Pink"), PRINTED_OFF_SHOULDER_TOP_WHITE("Printed Off Shoulder Top - White"),
    SLEEVES_TOP_AND_SHORT_BLUEANDPINK("Sleeves Top and Short - Blue & Pink"), LITTLE_GIRLS_MRPANDA_SHIRT("Little Girls Mr. Panda Shirt"),
    SLEEVELESS_UNICORN_PATCH_GOWN_PINK("Sleeveless Unicorn Patch Gown - Pink"), COTTON_MULL_EMBROIDERED_DRESS("Cotton Mull Embroidered Dress"),
    BLUE_COTTON_INDIE_MICKEY_DRESS("Blue Cotton Indie Mickey Dress"), LONG_MAXI_TULLE_FANCY_DRESS_UP_OUTFITS_PINK("Long Maxi Tulle Fancy Dress Up Outfits -Pink"),
    SLEEVELESS_UNICORN_PRINT_FITANDFLARE_NET_DRESS_MULTI("Sleeveless Unicorn Print Fit & Flare Net Dress - Multi");

    private String products;

    ProductsEnum(String products) {
        this.products = products;
    }

    public String getProducts() {
        return products;
    }
}
