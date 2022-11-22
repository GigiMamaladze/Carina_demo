package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.filter;

public enum Dubbing {
    GEORGIAN(" Georgian "), ENGLISH(" English "), RUSSIAN(" Russian "), FRENCH(" French "), DUTCH(" Dutch ");

    private String dubbing;

    Dubbing(String dubbing) {
        this.dubbing = dubbing;
    }

    public String getDubbing() {
        return dubbing;
    }
}
