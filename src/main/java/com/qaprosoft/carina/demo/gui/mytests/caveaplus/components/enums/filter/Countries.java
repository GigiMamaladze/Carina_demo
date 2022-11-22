package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter;

public enum Countries {
    GEORGIA(" Georgia "), USA(" USA "), RUSSIA(" Russia "), FRANCE(" France "), GERMANY(" Germany "),
    GREAT_BRITAIN(" Great Britain "), ITALY(" Italy "), POLAND(" Poland "), GREECE(" Greece "),
    JAPAN(" Japan "), AUSTRALIA(" Australia "), AUSTRIA(" Austria "), BELGIUM(" Belgium "),
    BRAZIL(" Brazil "), CANADA(" Canada "), CHINA(" China "), ESTONIA(" Estonia "), FINLAND(" Finland "),
    INDIA(" India "), IRAN(" Iran "), IRELAND(" Ireland "), ISRAEL(" Israel "), NORWAY(" Norway "),
    PORTUGAL(" Portugal "), SPAIN(" Spain "), SWITZERLAND(" Switzerland "), THAILAND(" Thailand "),
    TURKEY(" Turkey "), UKRAINE(" Ukraine "), DENMARK(" Denmark "), ARGENTINA(" Argentina "),
    SWEDEN(" Sweden "), HUNGARY(" Hungary "), TAIWAN(" Hungary "), SOUTH_KOREA(" South Korea "),
    MEXICO(" Mexico ");

    private String country;

    Countries(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
