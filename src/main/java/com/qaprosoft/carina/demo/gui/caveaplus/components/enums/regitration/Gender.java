package com.qaprosoft.carina.demo.gui.caveaplus.components.enums.regitration;

public enum Gender {
    MELA(" Male "), FEMALE(" Female ");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
