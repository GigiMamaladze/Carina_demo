package com.qaprosoft.carina.demo.gui_enums.automation_excercise;

public enum Brands {
    POLO("Polo"), H_AND_M("H&M"), MEDAME("Madame"), MAST_AND_HARBOUR("Mast & Harbour"), BABYHUG("Babyhug"),
    ALLEN_SOLLY_JUNIOR("Allen Solly Junior"), KOOKIE_KIDS("Kookie Kids"), BIBA("Biba");

    private String brand;

    Brands(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
