package com.qaprosoft.carina.demo.gui.mytests.caveaplus.components.enums.regitration;

public enum Month {
    JANUARY(" January "), FEBRUARY(" February "), MARCH(" March "), APRIL(" April "), MAY(" May "),
    JUNE(" June "), JULY(" July "), AUGUST(" August "), SEPTEMBER(" September "), OCTOBER(" October "),
    NOVEMBER(" November "), DECEMBER(" December ");

    private String month;

    Month(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
}
